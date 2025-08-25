package com.example.demo.exceptions;

public class ErrorMessage {
	private String name;
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ErrorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorMessage(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	

	
}
