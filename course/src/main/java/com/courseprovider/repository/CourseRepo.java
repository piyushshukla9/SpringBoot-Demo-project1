package com.courseprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courseprovider.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
