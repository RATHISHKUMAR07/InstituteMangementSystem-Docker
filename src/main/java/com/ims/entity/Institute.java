package com.ims.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Institute {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	private String name;
	@NotEmpty
	private String email;
	@NotEmpty
	private String location;
	@NotEmpty
	private String state;
	@NotEmpty
	private String country;
	@NotNull
	private int contact;
	@NotNull
	private int code;
	@NotEmpty
	private String university;
	@NotNull
	private int students;
	@NotNull
	private int professors; 
	@NotNull
	private int branchs;
	
	
	
	public Institute() {
		super();
	}
	
	
	
	
	
	public Institute(int id, @NotEmpty String name, @NotEmpty String email, @NotEmpty String location,
			@NotEmpty String state, @NotEmpty String country, @NotNull int contact, @NotNull int code,
			@NotEmpty String university, @NotNull int students, @NotNull int professors, @NotNull int branchs) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
		this.state = state;
		this.country = country;
		this.contact = contact;
		this.code = code;
		this.university = university;
		this.students = students;
		this.professors = professors;
		this.branchs = branchs;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	public int getStudents() {
		return students;
	}


	public void setStudents(int students) {
		this.students = students;
	}


	public int getProfessors() {
		return professors;
	}


	public void setProfessors(int professors) {
		this.professors = professors;
	}


	public int getBranchs() {
		return branchs;
	}


	public void setBranchs(int branchs) {
		this.branchs = branchs;
	}


	@Override
	public String toString() {
		return "Institute [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + ", state="
				+ state + ", country=" + country + ", contact=" + contact + ", code=" + code + ", university="
				+ university + ", students=" + students + ", professors=" + professors + ", branchs=" + branchs + "]";
	}
	
	
	
	
	
	
	
	
	
}
