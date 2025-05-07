package com.pattern.factory.insta;

public abstract class CreatePost {

    protected abstract Post createPost();

    public void  publish(PostRequest request){
        var post = this.createPost();
        post.publish(request);
    }
}
