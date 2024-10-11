import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0){
			sum+=sq%10;
			sq=sq/10;
		}
		if(sum==n){
			System.out.println("it is a neon number");
		}
		else{
			System.out.println("it is not a neon number");
		}
	}
}
