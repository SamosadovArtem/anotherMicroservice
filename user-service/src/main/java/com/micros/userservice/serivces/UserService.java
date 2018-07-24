package com.micros.userservice.serivces;

import com.micros.userservice.entity.User;

import reactor.core.publisher.Flux;

public interface UserSerivce {
  Flux<User> findAll();
}
