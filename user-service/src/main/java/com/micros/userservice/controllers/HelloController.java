package com.micros.userservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class HelloController {

  @RequestMapping( method = RequestMethod.GET)
  Mono<String> start() {
    return Mono.just("Hello from user service");
  }

}
