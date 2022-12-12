package com.example.demo.models.mongo_models;

import lombok.Data;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;
import java.util.Random;

@Document("Blog")
@Data
public class MongoBlog {
    @Id
    String blogId;
    String authorId, title, text;
    Date createdDate;
    int likes, staticLikes;

    void assignStaticLikes()
    {
        Random random=new Random();
        staticLikes= random.nextInt()%217;
    }

}
