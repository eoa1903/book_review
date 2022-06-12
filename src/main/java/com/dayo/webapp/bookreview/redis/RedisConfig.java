package com.dayo.webapp.bookreview.redis;

import com.dayo.webapp.bookreview.config.BookReviewConfig;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RedisConfig {
    @Autowired
    BookReviewConfig bConfig;

    @Bean("redis")
    public RedissonClient getRedis()
    {
        RedissonClient client = null;
        try {
            Config config = new Config();
            config.useSingleServer()
                    .setAddress(bConfig.getRedisAddress());
           client = Redisson.create(config);
        }
        catch (Exception e){
            log.info("From properties: {}",bConfig.getRedisAddress());
            log.error("Not connection", e.getMessage());
            //return null;
        }
        return client;
    }
}