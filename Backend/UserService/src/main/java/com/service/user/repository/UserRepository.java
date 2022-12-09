package com.service.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
