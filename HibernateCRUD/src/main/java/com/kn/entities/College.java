package com.kn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	 private int rollNo;
	 private String firstName;
	 private String lastName;
	 private String username;
	 private String gender;
	 private String address;
	 private String Dateofbirth;
	 public College() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public College(int rollNo, String firstName, String lastName, String username, String gender, String address,
			String dateofbirth) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.gender = gender;
		this.address = address;
		Dateofbirth = dateofbirth;
	 }
	 public int getRollNo() {
		 return rollNo;
	 }
	 public void setRollNo(int rollNo) {
		 this.rollNo = rollNo;
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
	 public String getUsername() {
		 return username;
	 }
	 public void setUsername(String username) {
		 this.username = username;
	 }
	 public String getGender() {
		 return gender;
	 }
	 public void setGender(String gender) {
		 this.gender = gender;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setAddress(String address) {
		 this.address = address;
	 }
	 public String getDateofbirth() {
		 return Dateofbirth;
	 }
	 public void setDateofbirth(String dateofbirth) {
		 Dateofbirth = dateofbirth;
	 }
	 @Override
	 public String toString() {
		return "College [rollNo=" + rollNo + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", gender=" + gender + ", address=" + address + ", Dateofbirth=" + Dateofbirth + "]";
	 }
	 

}
