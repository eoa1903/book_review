package com.dayo.webapp.bookreview.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "bookreview")
@Configuration
public class BookReviewConfig {
    private String redisAddress;
    //private String


}
