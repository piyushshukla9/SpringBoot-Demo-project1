package com.courseprovider.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int deptId;
	private String deptName;
	
	public Course() {
		super();
	}

	public Course(int id, String name, int deptId, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", deptId=" + deptId + ", deptName=" + deptName + "]";
	}	
	
}
