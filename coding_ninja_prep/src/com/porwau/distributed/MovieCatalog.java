package com.porwau.distributed;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieCatalog implements Search{
	
	MovieDaoService dao = new MovieDaoService();
	
	private Map<String,List<Movie>> movieByLanguage;
	private Map<String,List<Movie>> movieByTitle;
	private Map<String,List<Movie>> movieByGenre;
	private Map<String,List<Movie>> movieByCity;
	private Map<Date,List<Movie>> movieByReleaseDate;

	
	@Override
	public List<Movie> seachByTitle(String title) {
		//dao.getMovieByTitle(title);
		movieByTitle = new HashMap<>();
		if(dao.getMovieByTitle(title) != null) {
			movieByTitle.put(title, dao.getMovieByTitle(title));
		}
		return movieByTitle.get(title);
	}
	
	@Override
	public List<Movie> seachByLanguage(String language) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Movie> seachByRelease(Date releaseDate) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Movie> seachByGenre(String genre) {
		// TODO Auto-generated method stub
		return null;
	}
}
