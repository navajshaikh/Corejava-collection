package com.collection;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MovieService {

//1
	public TreeMap<Movie, Integer> addKeyValuePairsToMap(Movie movie, Integer rating) {
		Object e;

		Map<Movie, Integer> map = new TreeMap<Movie, Integer>();

		LocalDate date1 = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 2, 9);
		LocalDate date3 = LocalDate.of(2021, 3, 10);
		LocalDate date4 = LocalDate.of(2010, 6, 23);

		map.put(new Movie(100, "SINGHAM", "ACTION", date1, 5), 3);
		map.put(new Movie(300, "SPIDERMAN", "DRAMA", date2, 4), 5);
		map.put(new Movie(200, "KINGSMAN", "ACTION", date3, 5), 3);
		map.put(new Movie(50, "KRISH", "ACTION", date4, 3), 5);

		TreeMap<Movie, Integer> obj2 = new TreeMap<Movie, Integer>();
		obj2.putAll(map);

		obj2.entrySet();

		System.out.println(obj2);

		return obj2;
	}

//	public ArrayList<String> getHigherRatedMovieNames(int rating){
		//How to convert map to arraylist without removing duplicates.
		
//		Map<Integer,Movie> map=new TreeMap<Integer,Movie>();
//		
//		LocalDate date1 = LocalDate.of(2020, 1, 8);
//		LocalDate date2 = LocalDate.of(2022, 2, 9);
//		LocalDate date3 = LocalDate.of(2021, 3, 10);
//		LocalDate date4 = LocalDate.of(2010, 6, 23);
//		
//		map.put(5,new Movie(100,"SINGHAM","ACTION",date1));
//		map.put(4,new Movie(300,"SPIDERMAN","DRAMA",date2));
//		map.put(2,new Movie(200,"KINGSMAN","ACTION",date3));
//		map.put(5,new Movie(50,"KRISH","ACTION",date4));
//		
//		
//		
//		if(map.containsKey(rating)) {
//			System.out.println(map.get(rating));
//			Object value=map.values();
//			System.out.println( rating+""+value);
//		}else {
//			System.out.println("This type rating movies not available");
//		}
//		List<Movie> values = map.values().stream().collect(Collectors.toList());
//		System.out.println(values);
//		
//	
//		
//		
//		return null;
//		
//	}

//BY USNG LIST
	public ArrayList<Movie> getHigherRatedMovieNames(int rating) {

		ArrayList<Movie> list = new ArrayList<Movie>();

		LocalDate date1 = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 2, 9);
		LocalDate date3 = LocalDate.of(2021, 3, 10);
		LocalDate date4 = LocalDate.of(2010, 6, 23);

		list.add(new Movie(100, "SINGHAM", "ACTION", date1, 5));
		list.add(new Movie(300, "SPIDERMAN", "DRAMA", date2, 4));
		list.add(new Movie(200, "KINGSMAN", "ACTION", date3, 5));
		list.add(new Movie(50, "KRISH", "ACTION", date4, 3));

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Movie m = (Movie) it.next();

			if (m.getRating() == rating) {
				System.out.println(m);
			}
		}

		return list;

	}

	public ArrayList<Movie> getMovieNamesOfSpecificGenre(String genre) {
		ArrayList<Movie> list = new ArrayList<Movie>();

		LocalDate date1 = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 2, 9);
		LocalDate date3 = LocalDate.of(2021, 3, 10);
		LocalDate date4 = LocalDate.of(2010, 6, 23);

		list.add(new Movie(100, "SINGHAM", "ACTION", date1, 5));
		list.add(new Movie(300, "SPIDERMAN", "DRAMA", date2, 4));
		list.add(new Movie(200, "KINGSMAN", "ACTION", date3, 5));
		list.add(new Movie(50, "KRISH", "ACTION", date4, 3));

		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Movie m = (Movie) it.next();

			if (m.getGenre()== genre) {
				System.out.println(m);
			}
		}

		return list;
	}

	public ArrayList<Movie> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {

		ArrayList<Movie> list = new ArrayList<Movie>();

		LocalDate date1 = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 2, 9);
		LocalDate date3 = LocalDate.of(2021, 3, 10);
		LocalDate date4 = LocalDate.of(2010, 6, 23);

		list.add(new Movie(100, "SINGHAM", "ACTION", date1, 5));
		list.add(new Movie(300, "SPIDERMAN", "DRAMA", date2, 4));
		list.add(new Movie(200, "KINGSMAN", "ACTION", date3, 5));
		list.add(new Movie(50, "KRISH", "ACTION", date4, 3));

		list.add(new Movie(60, "RACE-3", "ACTION", date3, 1));
		list.add(new Movie(70, "ZERO", "ACTION", date4, 2));

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Movie m = (Movie) it.next();

			if (m.getReleaseDate().isAfter(releaseDate) && m.getRating() < 3) {
				System.out.println(m);
			}
		}

		return list;

	}

	public HashMap<Movie, String> getSortedMovieListByRating() {

		HashMap<Movie, String> obj = new HashMap<Movie, String>();

		LocalDate date1 = LocalDate.of(2020, 1, 8);
		LocalDate date2 = LocalDate.of(2022, 2, 9);
		LocalDate date3 = LocalDate.of(2021, 3, 10);
		LocalDate date4 = LocalDate.of(2010, 6, 23);

		obj.put(new Movie(100, "SINGHAM", "ACTION", date1, 5), "one");
		obj.put(new Movie(300, "SPIDERMAN", "DRAMA", date2, 4), "two");
		obj.put(new Movie(200, "KINGSMAN", "ACTION", date3, 5), "Three");
		obj.put(new Movie(50, "KRISH", "ACTION", date4, 3), "Four");

		TreeMap<Movie, String> obj2 = new TreeMap<Movie, String>();
		obj2.putAll(obj);

		for (Map.Entry<Movie, String> e : obj2.entrySet()) {

			System.out.println(e.getKey());

		}

		return obj;
	}

	public static void main(String[] args) {

		MovieService obj = new MovieService();
		// obj.addKeyValuePairsToMap(null, 1);
		// obj.getHigherRatedMovieNames(5);
		 obj.getMovieNamesOfSpecificGenre("ACTION");
		//obj.getSortedMovieListByRating();
		 //obj.getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate.of(2015, 1, 8));

	}

}
