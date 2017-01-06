package com.hand.model;

/**
 * Created by liuneng on 2017/1/3.
 */
public class Page{
    private int page;
    private int pageSize;
    private Film film;


    public int getPage() {
        return page;
    }

    public Page setPage(int page) {
        this.page = page;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getOffset() {
        return (page - 1) * pageSize;
    }

	public Film getFilm() {
		return film;
	}

	public Page setFilm(Film film) {
		this.film = film;
		return this;
	}

   
}
