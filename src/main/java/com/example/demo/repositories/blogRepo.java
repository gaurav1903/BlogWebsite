package com.example.demo.repositories;

import com.example.demo.models.Blog;
import com.example.demo.models.mongo_models.MongoBlog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface blogRepo extends MongoRepository<Blog,String> {//


}
