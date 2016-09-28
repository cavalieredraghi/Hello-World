package _12_challenge;

public class movie {

	String title;
	int yearReleased;
	String director;
	String genre;
//	String [] stars;
	double rating;
	double rottenTomatoScore;
	
	int movieLength;
	
//	//methods
//	public void getMovieLength() {
//		System.out.println(movieLength);
//		
//	
//	}
//	public void getGitGud() {
//		System.out.println(rating);
//	}
	public void getMovieInfo (){
		System.out.println(title + " "+ yearReleased +" "+ director +" "+ genre );
	}
	
	movie(String title, int yearReleased, String director, String genre){
		this.title=title;
		this.yearReleased=yearReleased;
		this.director=director;
		this.genre=genre;
		
	}
}
