import java.util.Scanner;
class GreatestNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		int res=a>b?a:b;
		System.out.println("The greast number is: "+res);

	}
}
