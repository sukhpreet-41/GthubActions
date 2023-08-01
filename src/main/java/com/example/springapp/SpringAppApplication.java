// package com.example.springapp;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class SpringAppApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringAppApplication.class, args);
// 	}

// }

// -----------------------

package com.example.springapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAppApplication {
	@RequestMapping("/")
	public String hello() {
		return "Hello User";
	}
}