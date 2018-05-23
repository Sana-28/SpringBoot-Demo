package com.springBootJpa.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;  

@Entity
public class UserData {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String name;
	private String address;
	
	public UserData() {
	}
	
	public UserData(String id, String name, String address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
