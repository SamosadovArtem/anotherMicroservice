package com.micros.userservice.interraction;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.micros.interraction.Interractor;
import com.micros.userservice.entity.User;

@Component
public class ClientInterractor extends Interractor {

  private static final String SERVICE_PATH = "/user-service/";

  ClientInterractor() {
    super(SERVICE_PATH);
  }

  public List<User> getAllUsers() {
    return Arrays.asList(get("users", User[].class));
  }
}
