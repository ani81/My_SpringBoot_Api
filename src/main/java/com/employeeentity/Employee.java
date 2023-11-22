package com.employeeentity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	private long id;
	private String name;
	private String profile;
	private long salary;
	private String experience;
	@Id
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", profile=" + profile + ", salary=" + salary + ", experience="
				+ experience + "]";
	}
	
	
	

}
