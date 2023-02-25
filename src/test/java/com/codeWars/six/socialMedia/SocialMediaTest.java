package com.codeWars.six.socialMedia;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SocialMediaTest {
    @Test
    void should_find_name_of_Likes_post_and_give_his_or_her_name() {
        SocialMedia media = new SocialMedia();

        String name = media.whoLikesIt("");
        Assertions.assertThat(name).isEqualTo("no one likes this");


        String petter = media.whoLikesIt("Peter");
        Assertions.assertThat(petter).isEqualTo("Peter likes this");


        String names = media.whoLikesIt("Jacob","Alex");
        Assertions.assertThat(names).isEqualTo("Jacob and Alex like this");
    }

}