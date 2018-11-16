package org.zerock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="org.zerock.mapper")
public class B77Application {

	public static void main(String[] args) {
		SpringApplication.run(B77Application.class, args);
	}
}
