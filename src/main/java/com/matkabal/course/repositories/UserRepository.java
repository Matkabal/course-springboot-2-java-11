package com.matkabal.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matkabal.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
