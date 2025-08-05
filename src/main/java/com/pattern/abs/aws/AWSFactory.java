package com.pattern.abs.aws;

import com.pattern.abs.CloudProvider;
import com.pattern.abs.Delete;
import com.pattern.abs.Download;
import com.pattern.abs.Upload;

public class AWSFactory implements CloudProvider {

    @Override
    public Download download() {
        return new AWSDownload();
    }

    @Override
    public Upload upload() {
        return new AWSUpload();
    }

    @Override
    public Delete delete() {
        return new AWSDelete();
    }
}
