package com.porwau.distributed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unchecked")
public class MovieDaoService {

	private static List<Movie> movies = new ArrayList<>();

	static {
		movies.add(new Movie("DDLJ", "Romance", new Date(), "Hindi", "AD Chops", Arrays.asList("SRK", "Kajol")));// TODO
		movies.add(new Movie("Notting Hill", "Romance", new Date(), "English", "Hugh Grant",
				Arrays.asList("Hugh Grant", "Julia Roberts")));
		movies.add(new Movie("Chokher Bali", "Drama", new Date(), "Bengali", "Rituparno Ghosh",
				Arrays.asList("Aishwarya", "Kajol")));
		movies.add(new Movie("Gone Girl", "Crime", new Date(), "English", "David F",
				Arrays.asList("Ben Affleck", "Rosamund Pike")));
		movies.add(new Movie("Gone in 60 seconds", "Crime", new Date(), "English", "Dominic Sena",
				Arrays.asList("Nicolas Cage", "A Jolie")));
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public List<Movie> getMovieByTitle(String title) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ListIterator iter = movies.listIterator();
		boolean found = false;
		List<Movie> movieList=new ArrayList<>();
		while (iter.hasNext()){
			Movie movie = (Movie) iter.next();
				if(movie.getTitle().contains(title)) {
					movieList.add(movie);		
					found = true;
			}
		}
		return found?movieList:null;
	}	
}
