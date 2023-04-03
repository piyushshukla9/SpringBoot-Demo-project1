package com.courseprovider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.courseprovider.entity.Course;
import com.courseprovider.repository.CourseRepo;

@RestController
//@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseRepo courseRepo;
	
	@GetMapping("/courses")
	public List<Course> show() {		
		return courseRepo.findAll();		
	}
	
	@GetMapping("/courses/{id}")
	public Course showCourse(@PathVariable int id) {
		return courseRepo.findById(id).get();
	}
	
	@PostMapping("/courses")
	public void add(@RequestBody Course course) {
		courseRepo.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteMapping(@PathVariable int id) {
		courseRepo.deleteById(id);
	}
}
