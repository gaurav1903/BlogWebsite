package com.example.demo.service;

import com.example.demo.models.Blog;

import java.util.List;

public interface BlogService {
    public Blog getById(String id);
    public List<Blog> getByAuthorId(String id);


}
