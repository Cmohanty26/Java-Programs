package com.Singleton;

public class BookMyShow {

	public static void main(String[] args) {
		MovieHall user1=MovieHall.getInst();
		user1.bookTicket(40);
		MovieHall user2=MovieHall.getInst();
		user2.bookTicket(40);
		//System.out.println(user1.getSeats());
		System.out.println(user2.getSeats());

	}

}
