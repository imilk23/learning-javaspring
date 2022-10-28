package com.example.springboot;

public class Course {
	private long id;
	private String name;
	private String author;
	
	public Course(long id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name =" + name + ", author=" + author + "]";
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAuthor() {
		return this.author;
	}
}
