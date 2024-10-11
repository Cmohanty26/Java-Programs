import java.util.Scanner;
class NumOfDays 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int y=sc.nextInt();
		System.out.println("Enter the month");
		int m=sc.nextInt();
		switch(m){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 days");
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 days");
			break;
			case 2:
				if(y%4==0 && (y%100!=0 || y%400==0)){
				System.out.println("29 days");
			}
			else{
				System.out.println("28 days");
			}

		}
	}
}
