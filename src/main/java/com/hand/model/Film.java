package com.hand.model;

public class Film {
	private Integer film_id;
	private String title;
	private String description;
	private Language language;
	public Integer getFilm_id() {
		return film_id;
	}
	public Film setFilm_id(Integer film_id) {
		this.film_id = film_id;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public Film setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getDescription() {
		return description;
	}
	public Film setDescription(String description) {
		this.description = description;
		return this;
	}
	public Language getLanguage() {
		return language;
	}
	public Film setLanguage(Language language) {
		this.language = language;
		return this;
	}
	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", description=" + description + ", language="
				+ language + "]";
	}
	
	

}
