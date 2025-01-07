package com.chris.bxdl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(value = {"com.chris"})
@MapperScan("com.chris.bxdl.infrastructure.mapper")
public class BxdlApplication {

	public static void main(String[] args) {
		SpringApplication.run(BxdlApplication.class, args);
	}

}
