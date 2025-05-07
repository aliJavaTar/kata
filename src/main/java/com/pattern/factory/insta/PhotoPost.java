package com.pattern.factory.insta;

public class PhotoPost implements Post {

    private final PostRepository postRepository;

    public PhotoPost(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void publish(PostRequest request) {
        var postEntity = new PostEntity();
        postEntity.setTitle(request.title());
        postEntity.setType("photo");
        postRepository.add(postEntity);
    }
}
