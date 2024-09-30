package com.jc.user_dept.entities;

public class Department {
	
	private Long id;
	private String name;
	
	public Department() {
		
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
