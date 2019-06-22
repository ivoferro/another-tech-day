package com.another_tech_day.repositories.blog;

import com.another_tech_day.model.blog.post.Post;

import java.util.Set;

public interface PostRepository {

    Set<Post> getAllPosts();
}
