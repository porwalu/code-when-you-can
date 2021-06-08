package com.porwau.distributed;

import java.util.Date;
import java.util.List;

public class Movie {
	private String title;
	private String genre;
	private Date releaseDate;
	private String language;
	private String director;
	private List<String> actors;

	public Movie() {
		super();
	}

	public Movie(String title, String genre, Date releaseDate, String language, String director, List<String> actors) {
		super();
		this.title = title;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.language = language;
		this.director = director;
		this.actors = actors;
	}

	public String getTitle() {
		return title;
	}

	public void setName(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", releaseDate=" + releaseDate + ", language=" + language
				+ ", director=" + director + ", actors=" + actors + "]";
	}
	
	
}
