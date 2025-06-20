package com.miniproject.one;

public class MovieSystem {
		String customerName;
		int id;
		static int universalid=29000;
		{
			id=universalid++;
		}
		public MovieSystem(String customerName){
			this.customerName=customerName;
		}
		
		Movieinfo[] store=new Movieinfo[3];
		int moviecount=0;

		public void storemovies(Movieinfo b) {
			
			if(moviecount<store.length) {
				
				store[moviecount]=b;
				moviecount++;

				//System.out.println(moviecount+" "+b.moviename+" at "+b.time+"\n Rating: "+b.review+"\n Single ticket: "+b.price);
		}else {
			System.out.println("\n You booked the maximum of 3 movies \n Please try after completing one of the order \n");
		}
		}		

		public void sortMovie() {
			for (int j=0;j<moviecount-1;j++) {
			for(int i=0;i<moviecount-1;i++) {
				if(store[i+1].review>store[i].review) {
					Movieinfo temp=store[i];
					store[i]=store[i+1];
					store[i+1]=temp;
					
				}
			}
		}
		}
		
		public void showBooked() {
			 System.out.println("\nStudent: " + customerName);
			 System.out.println("Roll No: " + id);
			 System.out.println("Movie Booked: ");
			 for(int i=0;i<moviecount;i++) {
				store[i].showDetails();
				}
		}

}
