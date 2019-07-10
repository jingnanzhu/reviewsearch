package com.example.reviewsearch.mapper;


import java.util.List;

import com.example.reviewsearch.model.Review;
import org.apache.ibatis.annotations.*;


@Mapper
public interface ReviewMapper {

    @Select("SELECT * FROM reviews WHERE id = #{id}")
    @Results(id="reviewResult", value={
            @Result(column="id", property="id", id=true),
            @Result(column="review", property="review"),
    })
    List<Review> getReviewById(long id);

    @Select("SELECT * FROM reviews  WHERE MATCH(review) AGAINST( #{key,jdbcType=VARCHAR} IN BOOLEAN MODE) limit 10")
    @Results(id="reviewResult2", value={
            @Result(column="id", property="id", id=true),
            @Result(column="review", property="review"),
    })
    List<Review> getReviewByKeyWord( String key);
}
