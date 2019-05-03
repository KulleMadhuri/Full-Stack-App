package com.opencyon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opencyon.utility.User;

public interface UserRepository extends JpaRepository<User, String> {

}
