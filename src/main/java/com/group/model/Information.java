package com.group.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Information")
public class Information {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_information", unique=true, nullable=false)
	private int id_information;
	@Column(name="title")
	private String title;
	@Column(name="category")
	private String category;
	@Column(name="description")
	private String description;
	@Column(name="image")
	private String image;
	@Column(name="header")
	private String header;
	@Column(name="visits")
	private int visits;
	@Column(name="likes")
	private int likes;
	@Column(name="id_user", unique=true)
	private int id_user;
	
	public Information(int id_information, String title, String category, String description, String image,
			String header, int visits, int likes, int id_user) {
		super();
		this.id_information = id_information;
		this.title = title;
		this.category = category;
		this.description = description;
		this.image = image;
		this.header = header;
		this.visits = visits;
		this.likes = likes;
		this.id_user = id_user;
	}
	public int getId_information() {
		return id_information;
	}
	public void setId_information(int id_information) {
		this.id_information = id_information;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	
}
