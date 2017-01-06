package com.hand.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.mapper.FilmMapper;
import com.hand.model.Film;
import com.hand.model.FilmData;
import com.hand.model.Language;
import com.hand.model.Page;
import com.hand.service.FilmService;

@Service
public class FilmServiceimpl implements FilmService{
	@Autowired
	private FilmMapper filmMapper;

	@Override
	public FilmData<Film> query(Page newpage) {
		FilmData<Film> filmDate=new FilmData<>();
		filmDate.setFilms(filmMapper.selectPage(newpage));
		filmDate.setTotal(filmMapper.selectCount(newpage));
		return filmDate;
	}

	@Override
	public List<Language> getLanguageDate() {
		return filmMapper.selectLanguage();
	}

	@Override
	public Film getFilm(int film_id) {
		return filmMapper.selectFilm(film_id);
		
	}

	@Override
	public boolean nowupdate(Film film) {
		try{
			film.setLanguage(new Language().setLanguage_id(filmMapper.selectLanguageId(film)));
			filmMapper.update(film);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean delete(int film_id) {
		try{
		filmMapper.delete(film_id);
		return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean addfilm(Film film) {
		film.setLanguage(new Language().setLanguage_id(filmMapper.selectLanguageId(film)));
		filmMapper.insert(film);
		return true;
	}
	

}
