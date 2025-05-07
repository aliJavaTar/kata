package com.pattern.factory.insta;

public class createPhotoPost extends CreatePost {
    @Override
    protected Post createPost() {
        return new PhotoPost(post -> null);
    }
}
