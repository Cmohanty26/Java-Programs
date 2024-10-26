package com.Singleton;

public class MovieHall {

	private int seats=50;
	private static MovieHall m=null;
	private MovieHall() {
		
	}
	public void bookTicket(int n) {
		if(n<=seats) {
			seats-=n;
			System.out.println(n+"seats is Booked");
		}
		else {
			System.out.println(n+"seats is not available");
		}
	}
	public static MovieHall getInst() {
		if(m==null) {
			m=new MovieHall();
			return m;
		}
		else {
			return m;
		}
	}
	public int getSeats() {
		return seats;
	}

}
