package com.example.reviewsearch.controller;

import com.example.reviewsearch.mapper.ReviewMapper;
import com.example.reviewsearch.model.Review;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@Controller
public class ReviewManager {
    ReviewMapper mapper;

    public ReviewManager(ReviewMapper mapper) {
        this.mapper =  mapper;
    }
    @RequestMapping("/listbyid")
    @ResponseBody
    public List<Review> listCard(@RequestParam("id") long id){
        return mapper.getReviewById(id);
    }

    @RequestMapping("/listbykeyword")
    @ResponseBody
    public List<Review> listReviewByKeyWord(@RequestParam("key") String key){
            return mapper.getReviewByKeyWord(key);
    }
}
