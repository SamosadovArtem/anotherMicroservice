package com.micros.userservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.micros.userservice.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
