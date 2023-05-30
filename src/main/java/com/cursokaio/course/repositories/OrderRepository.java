package com.cursokaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursokaio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order , Long> {
	

}
