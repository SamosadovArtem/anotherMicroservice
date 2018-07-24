package com.micros.userservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micros.userservice.entity.User;
import com.micros.userservice.interraction.ClientInterractor;

@RestController
@RequestMapping("/")
public class HelloController {

  @Autowired
  private ClientInterractor selfInterractor;

  @RequestMapping( method = RequestMethod.GET)
  List<User> start() {
    return selfInterractor.getAllUsers();
  }

}
