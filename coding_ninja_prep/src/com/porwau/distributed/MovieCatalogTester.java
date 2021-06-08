package com.porwau.distributed;

import java.util.Arrays;

public class MovieCatalogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieCatalog catalog  = new MovieCatalog();
		
		//System.out.println(Arrays.toString((catalog.seachByTitle("Gone")).toArray()));
		
		System.out.println(catalog.seachByTitle("Goner") ==  null ? "Movie Not Found" : catalog.seachByTitle("Goner"));
	}

}
