package com.collection;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Movie implements Comparable<Movie> {

	private int movieId;
	private String movieName;
	private String genre;
	private LocalDate releaseDate;
	private  Integer rating;
	
	

	public Movie(int movieId, String movieName, String genre, LocalDate releaseDate , int rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.genre = genre;
		this.releaseDate = releaseDate;
		this.rating=rating;
	}
	

	public int getRating() {
		return rating;
	}


	public int getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getGenre() {
		return genre;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", releaseDate="
				+ releaseDate + ", rating="
						+ rating + "]";
	}

	@Override
	public int compareTo(Movie  movie) {
		//ORDER REVERSE
		
		return movie.releaseDate.compareTo(this.releaseDate);
	}
	
//	@Override
//	public int compareTo(Movie  movie) {
//		//ORDER REVERSE
//		
//		return movie.rating.compareTo(rating);
//	}
	
	
	
	

	
	public static void main(String[] args) {
		
		
		HashMap<Movie, String> obj=new HashMap<Movie, String>();
		
		LocalDate date1 = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 2, 9);
		LocalDate date3 = LocalDate.of(2021, 3, 10);
		LocalDate date4 = LocalDate.of(2010, 6, 23);
		
		obj.put(new Movie(100,"SINGHAM","ACTION",date1,5),"one");
		obj.put(new Movie(300,"SPIDERMAN","DRAMA",date2,4),"two");
		obj.put(new Movie(200,"KINGSMAN","ACTION",date3,5),"Three");
		obj.put(new Movie(50,"KRISH","ACTION",date4,3),"Four");
		
	
	//	System.out.println(obj);
		
		TreeMap<Movie, String> obj2=new TreeMap<Movie, String>();
		obj2.putAll(obj);
		
		
		
		for(Map.Entry<Movie, String> e:obj2.entrySet()) {
			
			
			System.out.println(e.getKey());
			
			
		}
		
		
		
	}
	
	
	
	
}
