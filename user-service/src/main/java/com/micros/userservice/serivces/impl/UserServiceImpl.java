package com.micros.userservice.serivces.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.micros.userservice.entity.User;
import com.micros.userservice.repository.UserRepository;
import com.micros.userservice.serivces.UserService;

@Service
public class UserServiceImpl implements UserService {

  ObjectMapper mapper = new ObjectMapper();

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> findAll() {
    List<User> users = (List<User>) userRepository.findAll();
    return users;
  }
}
