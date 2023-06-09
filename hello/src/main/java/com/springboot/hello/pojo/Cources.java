package com.springboot.hello.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cources {

	@Id
	private int id;
	private String name;
	private String description;
	
	//--------------------------------------
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Cources(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public Cources() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Cources [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
