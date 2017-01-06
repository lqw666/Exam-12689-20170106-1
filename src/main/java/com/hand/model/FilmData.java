package com.hand.model;

import java.util.List;

/**
 * Created by liuneng on 2017/1/3.
 */
public class FilmData<T>  {
    private int total;
    private List<Film> films;

    public int getTotal() {
        return total;
    }

    public FilmData setTotal(int total) {
        this.total = total;
        return this;
    }

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

}
