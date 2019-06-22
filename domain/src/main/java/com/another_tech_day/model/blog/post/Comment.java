package com.another_tech_day.model.blog.post;

import com.another_tech_day.model.blog.user.User;

import java.time.LocalDateTime;

public class Comment {

    private User author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String body;
}
