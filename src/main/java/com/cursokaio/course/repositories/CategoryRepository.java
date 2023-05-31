package com.cursokaio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursokaio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
