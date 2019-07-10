package com.example.reviewsearch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import lombok.Data;
import lombok.*;

/**
 * Created by jingnanzhu on 6/12/19.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    Long id;
    String review;
}
