import java.util.Scanner;
class PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(isPrime(n,2)){
			System.out.println("It is a prime no");
       }
		else
		{
			System.out.println("It is not a prime no");

		}
	}
	public static boolean isPrime(int n,int i){
		if(n<=2)return false;
		if(n%i==0) return false;
		if(i>n/2) return true;
		return isPrime(n,i+1);
	}



}
