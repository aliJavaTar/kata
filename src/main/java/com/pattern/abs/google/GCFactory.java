package com.pattern.abs.google;

import com.pattern.abs.CloudProvider;
import com.pattern.abs.Delete;
import com.pattern.abs.Download;
import com.pattern.abs.Upload;

public class GCFactory implements CloudProvider {
    @Override
    public Download download() {
        return new GCDownload();
    }

    @Override
    public Upload upload() {
        return null;
    }

    @Override
    public Delete delete() {
        return null;
    }
}
