package com.pattern;

public class CloudAzerFactory implements Cloud {
    @Override
    public DownloadFile downloadFile(String fileName) {
        return new AWSDownload();
    }

    @Override
    public UplodeFile uplodeFile(String fileName) {
        return new  AWSUplodeFile();
    }
}
