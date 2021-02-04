package com.example.demoRedisCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoRedisCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRedisCacheApplication.class, args);
	}

}
