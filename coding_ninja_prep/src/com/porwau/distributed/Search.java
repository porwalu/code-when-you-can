package com.porwau.distributed;

import java.util.Date;
import java.util.List;

public interface Search {
	public List<Movie> seachByTitle(String title);
	//TODO
//	public List<Movie> seachByCity(String city);
	public List<Movie> seachByLanguage(String language);
	public List<Movie> seachByRelease(Date releaseDate);
	public List<Movie> seachByGenre(String genre);	
}
