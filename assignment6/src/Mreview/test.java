package Mreview;

public class test {
	public static void main(String[] args) {
		Mreview movie1= new Mreview("Avenger",5);
		movie1.addRating(4);
		movie1.addRating(5);
		movie1.addRating(5);
		System.out.println(movie1.toString());
		
		Mreview movie2 = new Mreview("Titan");
		movie2.addRating(3);
		movie2.addRating(4);
		System.out.println(movie2.toString());
	}
}
