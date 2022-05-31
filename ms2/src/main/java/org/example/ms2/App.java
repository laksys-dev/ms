package org.example.ms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		System.out.println("----------starts ms2----------");
		SpringApplication.run(App.class, args);
		System.out.println("-----------end ms2------------");
	}
}
