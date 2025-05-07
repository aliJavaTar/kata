package com.pattern.factory.insta;

public class StoryPost implements Post {
    private final PostRepository postRepository;

    public StoryPost(PostRepository postRepository) {
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
