package com.pattern.abs;

public interface CloudProvider {

    Download download();

    Upload upload();

    Delete delete();
}
