package org.example.ms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println("-------- starting ms1----------");
		SpringApplication.run(App.class, args);
		System.out.println("----------ending ms1-----------");
	}
}
