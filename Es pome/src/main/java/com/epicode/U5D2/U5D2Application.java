package com.epicode.U5D2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class U5D2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5D2Application.class, args);
		System.out.println("Hello");
	}

}
