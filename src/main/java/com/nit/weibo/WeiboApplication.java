package com.nit.weibo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nit.weibo.dao")
public class WeiboApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeiboApplication.class, args);
	}
}
