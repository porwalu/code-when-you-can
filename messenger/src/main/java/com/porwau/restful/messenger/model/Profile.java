package com.porwau.restful.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Profile {
	
	public Profile() {
		
	}
	public Profile(Long id, String userName, String firstName, String lastName) {
		this.id=id;
		this.userName = userName;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdAt = new Date();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private Long id;
	private String userName;
	private String firstName;
	private String lastName ;
	private Date createdAt;
}
