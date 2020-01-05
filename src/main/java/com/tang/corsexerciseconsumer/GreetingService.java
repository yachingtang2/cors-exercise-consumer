package com.tang.corsexerciseconsumer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class GreetingService {

  private RestTemplate restTemplate;

  public GreetingService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public String getGreeting() {
    URI uri = URI.create("http://localhost:8080/greeting");

    return restTemplate.getForEntity(uri, String.class).getBody();
  }
}
