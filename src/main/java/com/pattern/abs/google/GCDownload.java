package com.pattern.abs.google;

import com.pattern.abs.Download;

public class GCDownload implements Download {
    @Override
    public void download() {
        System.out.println("Downloading...");
    }
}