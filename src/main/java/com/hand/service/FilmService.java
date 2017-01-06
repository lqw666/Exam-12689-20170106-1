package com.hand.service;

import java.util.List;

import com.hand.model.Film;
import com.hand.model.FilmData;
import com.hand.model.Language;
import com.hand.model.Page;

public interface FilmService {
	public FilmData<Film> query(Page newpage);
	public List<Language> getLanguageDate();
	public Film getFilm(int film_id);
	public boolean nowupdate(Film film);
	public boolean delete(int film_id);
	public boolean addfilm(Film film);
}
