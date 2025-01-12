package com.Encpasulation;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) {
		boolean r=true;
		Mobile m=null;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Add\n 2.dispaly\n 3.price\n 4.change\n 5.Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:
			{
				System.out.println("Enter Mobile name:");
				String name=sc.next();
				System.out.println("Enter Mobile Ram:");
				int ram=sc.nextInt();
				System.out.println("Enter Mobile Rom");
				int rom=sc.nextInt();
				System.out.println("Enter Mobile Price");
				double price=sc.nextDouble();
				System.out.println("Enter Mobile color");
				String color=sc.next();
				m=new Mobile(name, ram, rom, price, color);
				
			}
			break;
			case 2:{
				if(m!=null) {
					m.display();
					
				}
				else {
					System.out.println("No mobile added");
				}
			}
			break;
			case 3:{
				if(m!=null) {
					System.out.println(m.getPrice());
				}
				else {
					System.out.println("No mobile added");
				}
				
			}
			break;
			case 4:
			{
				if(m!=null) {
					System.out.println("Enter the color");
					String color=sc.next();
					System.out.println("Old color:"+ m.getColor());
					m.setColor(color);
					System.out.println("Modified color:"+m.getColor());
				}
				else {
					System.out.println("No mobile added");
				}
			}
			break;
			case 5:{
				r=false;
				System.out.println("Thank you visit again");
			}
			break;
			default:
				System.out.println("Enter valid no");
			}
			
		}while(r);
		
		

	}

}
