package com.hand.mapper;

import java.util.List;

import com.hand.model.Film;
import com.hand.model.Language;
import com.hand.model.Page;

public interface FilmMapper {
	public List<Film> selectPage(Page newpage);
	public int selectCount(Page page);
	public List<Language> selectLanguage();
	public Film selectFilm(int film_id);
	public void update(Film film);
	public int selectLanguageId(Film film);
	public void delete(int film_id);
	public void insert(Film film);
}
