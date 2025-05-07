package com.pattern.factory.insta;

public class VideoPost implements Post {
    private final PostRepository postRepository;

    public VideoPost(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void publish(PostRequest request) {
        var postEntity = new PostEntity();
        postEntity.setTitle(request.title());
        postEntity.setType("video");
        postRepository.add(postEntity);
    }
}
