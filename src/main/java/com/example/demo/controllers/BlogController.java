package com.example.demo.controllers;


import com.example.demo.models.Blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/reqBlogs")
public class BlogController {


    @GetMapping("/blogs")
    List<Blog> getAllBlogs()
    {
        List<Blog>l=null;
        return l;
        
    }

    @GetMapping("/blogs/{blogId}")
    Blog getBlog(@PathVariable String blogId)
    {
        return new Blog("","","",new Date(),0,0,"","");
    }

    @GetMapping("/blogsbyauthor/{authorId}")
    List<Blog> getAllBlogsByAuthor(@PathVariable String authorId)
    {
        List<Blog>l=null;
        return l;
    }

}
