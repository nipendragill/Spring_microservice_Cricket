package com.cricket_app.basics.cricket_app;

public class Book {
	int id;
	String  name;
	String author_name;
	
	Book(int id, String name, String author_name)
	{
		this.id=id;
		this.name = name;
		this.author_name= author_name;
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
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

}
