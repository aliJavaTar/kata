package com.codeWars.six.socialMedia;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SocialMediaTest {
    @Test
    void should_find_name_of_Likes_post_and_give_his_or_her_name() {
        SocialMedia media = new SocialMedia();

//        String name = media.whoLikesIt("");
//        assertThat(name).isEqualTo("no one likes this");

        String name1 = media.whoLikesIt();
        assertThat(name1).isEqualTo("no one likes this");


        String petter = media.whoLikesIt("Peter");
        assertThat(petter).isEqualTo("Peter like this");


        String names = media.whoLikesIt("Jacob", "Alex");
        assertThat(names).isEqualTo("Jacob and Alex like this");

        String three_names = media.whoLikesIt("Max", "John", "Mark");
        assertThat(three_names).isEqualTo("Max, John and Mark like this");

        String four_names = media.whoLikesIt("Alex", "Jacob", "Mark", "Max");
        assertThat(four_names).isEqualTo("Alex, Jacob and 2 others like this");
    }

}