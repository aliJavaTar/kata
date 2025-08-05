package com.pattern.abs.azuer;

import com.pattern.abs.CloudProvider;
import com.pattern.abs.Delete;
import com.pattern.abs.Download;
import com.pattern.abs.Upload;

public class AzuerFactory implements CloudProvider {

    @Override
    public Download download() {
        return new AzuerDownload();
    }

    @Override
    public Upload upload() {
        return new AzuerUpload();
    }

    @Override
    public Delete delete() {
        return new AzuerDelete();
    }
}
