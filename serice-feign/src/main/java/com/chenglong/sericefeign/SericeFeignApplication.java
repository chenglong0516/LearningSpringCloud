package com.chenglong.sericefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SericeFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SericeFeignApplication.class, args);
	}
}
