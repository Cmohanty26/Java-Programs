import java.util.Scanner;
class AddRandomNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int res=sum(n);
		System.out.println("The sum of random number is: "+res);
	}
	public static int sum(int n){
		if(n<=9)return n;
		return sum(n/10)+(n%10);
	}
}
