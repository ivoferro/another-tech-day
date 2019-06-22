package com.another_tech_day.model.blog.post;

import com.another_tech_day.model.blog.user.User;

import java.time.LocalDateTime;
import java.util.Set;

public class Post {

    private User author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String title;
    private String body;
    private Set<Comment> comments;
}
