package com.project.course.repositories;



import com.project.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository <Category, Long> {

}
