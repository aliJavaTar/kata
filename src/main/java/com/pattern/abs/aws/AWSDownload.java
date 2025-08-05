package com.pattern.abs.aws;

import com.pattern.abs.Download;

public class AWSDownload implements Download {

    @Override
    public void download() {
        System.out.println("AWS Download");
    }

}
