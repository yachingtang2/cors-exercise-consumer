package com.tang.corsexerciseconsumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@ExtendWith(MockitoExtension.class)
class CorsExerciseConsumerControllerTest {

  @InjectMocks
  private CorsExerciseConsumerController controller;

  @Mock
  private GreetingService service;

  private MockMvc mvc;

  @BeforeEach
  void setUp() {
    mvc = standaloneSetup(controller).build();
  }

  @Test
  void getGreeting() throws Exception {
    given(service.getGreeting()).willReturn("Hello");

    mvc.perform(get("/")
        .accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(content().string("Hello"));
  }
}
