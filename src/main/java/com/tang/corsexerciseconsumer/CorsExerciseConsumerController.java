package com.tang.corsexerciseconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsExerciseConsumerController {

  private final GreetingService service;

  public CorsExerciseConsumerController(GreetingService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String getGreeting() {
    return service.getGreeting();
  }
}
