package com.digitel.digitel_smartphones;

//Vanessa Victorino - 301201653
//04OCT24

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class DigitelSmartphonesApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DigitelSmartphonesApplication.class, args);
		 System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
	     var names = ctx.getBeanDefinitionNames();
	     Arrays.sort(names);
	     Arrays.asList(names).forEach(System.out::println);		
		
	}

}
