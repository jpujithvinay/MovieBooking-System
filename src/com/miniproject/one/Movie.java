package com.miniproject.one;

class Movieinfo{
	String moviename;
	Double time;
	int review;
	Double price;
	
	Movieinfo(String moviename,Double time,int review,Double price){
		this.moviename=moviename;
		this.time=time;
		this.review=review;
		this.price=price;
	}
	
	void showDetails() {
		System.out.println("\n"+moviename+" at "+time+"\n Rating: "+review+"\n Single ticket: "+price+" \n ");

	}

	
}
public class Movie {
	public static void main(String args[]) {
	Movieinfo b1=new Movieinfo(" Harry Potter",9.05,7,180.00);
	Movieinfo b2=new Movieinfo(" Gold",9.45,9,180.00);
	Movieinfo b3=new Movieinfo(" Film red",10.00,10,180.00);
	Movieinfo b4=new Movieinfo(" Film Stampede",11.00,11,180.00);
	b1.showDetails();
	b2.showDetails();
	b3.showDetails();
	b4.showDetails();
	MovieSystem m1=new MovieSystem("Akku");
	m1.storemovies(b1);
	m1.storemovies(b2);
	m1.sortMovie();
	m1.showBooked(); 
	
}
}
