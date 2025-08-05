package com.pattern.abs.aws;

import com.pattern.abs.Upload;

public class AWSUpload implements Upload {
    @Override
    public void upload() {
        System.out.println("Upload AWS");
    }
}
