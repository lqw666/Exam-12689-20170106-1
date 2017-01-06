package com.hand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hand.model.Film;
import com.hand.model.FilmData;
import com.hand.model.Language;
import com.hand.model.Page;
import com.hand.service.CustomerService;
import com.hand.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private FilmService filmService;
	@ResponseBody
	@RequestMapping("/login")
	public String Login(String first_name) {
		if(customerService.CheckLogin(first_name)){
			return "show.html";
		}
		return "false";
		
	}
	@RequestMapping("/query")
	@ResponseBody
	public FilmData<Film> query(@RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "page",required = false, defaultValue = "1") int page,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize){
		Page newpage=new Page();
		newpage.setPage(page).setPageSize(pageSize).setFilm(new Film().setTitle(title));
		return filmService.query(newpage);
		
	}
	@RequestMapping("/language")
	@ResponseBody
	public List<Language> getLanguage(){
		return filmService.getLanguageDate();
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Film getFilm(@RequestParam(name = "id") int film_id){
		return filmService.getFilm(film_id);
	}
	
	@RequestMapping("/nowupdate")
	@ResponseBody
	public String nowupdate(@RequestParam(name="film_id") int film_id, @RequestParam(name="title")String title,
			@RequestParam(name="description") String description, @RequestParam(name="language") String language){
		Film film=new Film().setFilm_id(film_id).setDescription(description).setTitle(title).setLanguage(new Language().setName(language));
		if(filmService.nowupdate(film)){
			return "show.html";
		}else{
			return "false";
		}
	}
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int id){
		if(filmService.delete(id)){
			return "show.html";
		}
		else{
			return "false";
		}
	}
	@RequestMapping("/addfilm")
	public String insert(@RequestParam(name="title")String title,
			@RequestParam(name="description") String description, @RequestParam(name="language") String language){
			Film film=new Film().setDescription(description).setTitle(title).setLanguage(new Language().setName(language));
		if(filmService.addfilm(film)){
			return "show.html";
		}else{
			return "false";
		}
	}
	}