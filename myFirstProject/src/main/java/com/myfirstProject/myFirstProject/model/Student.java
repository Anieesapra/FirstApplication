package com.myfirstProject.myFirstProject.model;

public class Student {

	public Student() {
		super();
	}
	public Student(int id, String name, String standard, String section, String issueDate) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.section = section;
		this.issueDate = issueDate;
	}
	int id;
	String name;
	String standard;
	String section;
	String issueDate;
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
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
}
