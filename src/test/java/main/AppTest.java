package main;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {

	@Autowired
	private TestController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

    @Value(value="${local.server.port}")
	private int port;

	//@Autowired
	private RestTemplate restTemplate = new RestTemplate();

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class)).contains("Hello Spring Boot App");
	}

	@org.junit.Test
	public void tsetThymleafExample() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/tst",
				String.class)).contains("Current time");
	}
}