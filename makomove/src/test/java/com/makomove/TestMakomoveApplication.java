package com.makomove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMakomoveApplication {

	public static void main(String[] args) {
		SpringApplication.from(MakomoveApplication::main).with(TestMakomoveApplication.class).run(args);
	}

}
