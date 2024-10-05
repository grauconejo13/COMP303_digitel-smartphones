package com.digitel.digitel_smartphones;

import org.springframework.boot.SpringApplication;

public class TestDigitelSmartphonesApplication {

	public static void main(String[] args) {
		SpringApplication.from(DigitelSmartphonesApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
