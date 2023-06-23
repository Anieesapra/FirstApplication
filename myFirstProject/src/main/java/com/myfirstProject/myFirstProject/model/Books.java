package com.myfirstProject.myFirstProject.model;

public class Books {

	public Books() {
		super();
	}
	public Books(int id, String name, String doi, String publisher, String studentName) {
		super();
		this.id = id;
		this.name = name;
		this.doi = doi;
		this.publisher = publisher;
		this.studentName = studentName;
	}
	
	private int id; // unique
	private String name;
	private String doi;
	private String publisher;
	private String studentName;
	
	
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
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
}
