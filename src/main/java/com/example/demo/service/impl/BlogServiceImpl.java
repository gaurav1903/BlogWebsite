package com.example.demo.service.impl;

import com.example.demo.models.Blog;
import com.example.demo.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {


    @Override
    public Blog getById(String id) {
        return null;
    }

    @Override
    public List<Blog> getByAuthorId(String id) {
        return null;
    }
}
