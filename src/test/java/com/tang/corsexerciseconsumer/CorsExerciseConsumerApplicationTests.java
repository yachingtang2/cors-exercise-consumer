package com.tang.corsexerciseconsumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CorsExerciseConsumerApplicationTests {

	private CorsExerciseConsumerApplication application;

	@BeforeEach
	void setUp() {
		application = new CorsExerciseConsumerApplication();
	}

	@Test
	void contextLoads() {
		assertThat(application).isNotNull();
	}

}
