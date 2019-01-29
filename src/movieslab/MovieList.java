package movieslab;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {
	private static ArrayList<Movie> movieList = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		String cont = "";
		String selection;
		Movie movies = new Movie();
		
		populateMovieList(movies);
		
		System.out.println("Welcome to the Movie List Application!");
		
		do {
			System.out.printf("1)%-10s 2)%-10s 3)%-10s 4)%-10s\n", "Animated", "Drama", "Horror", "Scifi");
			System.out.print("What category are you interested in?: ");
			selection = scnr.nextLine();
			
			switch(selection) {
			case "1":
			case "Animated": selection = "animated";
			break;
			case "2":
			case "Drama": selection = "drama";
			break;
			case "3":
			case "Horror": selection = "horror";
			break;
			case "4":
			case "Scifi": selection = "scifi";
			break;
			default: System.out.println("Invalid entry please try again.");
			continue;
			}
			
			alphabeticalOrder(selection);
			
			System.out.print("Continue? (y/n): ");
			cont = scnr.nextLine();
		} while(!cont.equalsIgnoreCase("n"));
		System.out.println("Goodbye!");
		scnr.close();
	}
	
	public static void populateMovieList(Movie movie) {
		MovieIO movieIO = new MovieIO(); 
		
		for(int i = 0; i < 100; i++) {
			movieList.add(MovieIO.getMovie(i));
		}
	}
	
	public static void alphabeticalOrder(String selection) {
		String temp;
		boolean sorted;
		for(Movie movie:movieList) {
			if(movie.getCategory().equalsIgnoreCase(selection)) {
				do {
					for()
				} while(sorted = false);
			}
		}
	}
}