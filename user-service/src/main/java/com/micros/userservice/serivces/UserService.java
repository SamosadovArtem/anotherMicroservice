package com.micros.userservice.serivces;

import java.util.List;

import com.micros.userservice.entity.User;

public interface UserService {
  List<User> findAll();
}
