package com.cursokaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursokaio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
