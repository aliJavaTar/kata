package com.pattern.factory;

import java.io.ByteArrayInputStream;
import java.sql.Blob;

// BAD CODE - This is what junior developers write
public class CloudStorageService {
    
    private String cloudProvider;
    
    public void uploadFile(String fileName, byte[] data) {
        // NIGHTMARE: Tight coupling with if-else hell
        if ("AWS".equals(cloudProvider)) {
            // AWS specific code
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .build();
            
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setContentLength(data.length);
            
            PutObjectRequest request = new PutObjectRequest(
                "my-aws-bucket", 
                fileName, 
                new ByteArrayInputStream(data),
                metadata
            );
            s3Client.putObject(request);
            
            System.out.println("Uploaded to S3: " + fileName);
            
        } else if ("GCP".equals(cloudProvider)) {

            Storage storage = StorageOptions.getDefaultInstance().getService();
            
            BlobId blobId = BlobId.of("my-gcp-bucket", fileName);
            BlobInfo blobInfo = BlobInfo.newBuilder(blobId)
                .setContentType("application/octet-stream")
                .build();
            
            storage.create(blobInfo, data);
            
            // GCP specific logging
            System.out.println("Uploaded to GCS: " + fileName);
            
        } else if ("AZURE".equals(cloudProvider)) {

            BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString("DefaultEndpointsProtocol=https;AccountName=...")
                .buildClient();
            
            BlobContainerClient containerClient = blobServiceClient
                .getBlobContainerClient("my-azure-container");
            
            BlobClient blobClient = containerClient.getBlobClient(fileName);
            blobClient.upload(new ByteArrayInputStream(data), data.length, true);
            
            System.out.println("Uploaded to Azure Blob: " + fileName);
        }
    }
    
    public String downloadFile(String fileName) {
        if ("AWS".equals(cloudProvider)) {
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withRegion(Regions.US_EAST_1)
                .build();
            
            S3Object object = s3Client.getObject("my-aws-bucket", fileName);
            // Convert to string logic...
            return "AWS file content";
            
        } else if ("GCP".equals(cloudProvider)) {
            Storage storage = StorageOptions.getDefaultInstance().getService();
            Blob blob = storage.get("my-gcp-bucket", fileName);
            return new String(blob.getContent());
            
        } else if ("AZURE".equals(cloudProvider)) {
            BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
                .connectionString("DefaultEndpointsProtocol=https;AccountName=...")
                .buildClient();
            
            BlobContainerClient containerClient = blobServiceClient
                .getBlobContainerClient("my-azure-container");
            BlobClient blobClient = containerClient.getBlobClient(fileName);
            
            return blobClient.downloadContent().toString();
        }
        
        throw new RuntimeException("Unsupported cloud provider: " + cloudProvider);
    }
    
    public void deleteFile(String fileName) {
        // More if-else hell... you get the picture
        // This method would be 50+ lines of duplicate code
    }
}