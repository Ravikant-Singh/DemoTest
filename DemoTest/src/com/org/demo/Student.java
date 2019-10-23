package com.org.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Size(min=10,max=20,message="required")  
	private String firstname;
	
	@Size(max=10,message="required")  
    @NotNull(message="required")
	private int mblnum;
    
    @Size(min=10,max=20,message="required")
	private String username;
    
    @Size(min=10,max=20,message="required")
	private String password;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getMblnum() {
		return mblnum;
	}
	public void setMblnum(int mblnum) {
		this.mblnum = mblnum;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", mblnum=" + mblnum + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	

}
