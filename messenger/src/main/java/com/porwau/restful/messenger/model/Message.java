package com.porwau.restful.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	public Message() {

	}

	public Message(long l, String content, String author) {
		this.content = content;
		this.id = l;
		this.author = author;
		this.createdAt = new Date();
	}

	private long id;
	private String content;
	private String author;
	private Date createdAt;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long i) {
		this.id = i;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
