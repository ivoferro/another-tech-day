package com.another_tech_day.use_cases.blog.posts;

import com.another_tech_day.model.blog.post.Post;
import com.another_tech_day.repositories.blog.PostRepository;

import java.util.Set;

public class ReadPostUseCase {

    private PostRepository postRepository;

    public Set<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }
}
