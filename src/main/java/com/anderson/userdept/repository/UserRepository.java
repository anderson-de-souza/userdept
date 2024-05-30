package com.anderson.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anderson.userdept.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
