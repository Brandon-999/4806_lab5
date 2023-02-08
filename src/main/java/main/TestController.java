package main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
	@GetMapping("/")
	public String message() {
		return"---------Hello Spring Boot App------------";
	}

	@GetMapping("/bud")
	public BuddyInfo bud() {
		return new BuddyInfo("Brandon", "613-143-4234");
	}
}