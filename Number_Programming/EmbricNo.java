import java.util.Scanner;
class EmbricNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int reverse=isReverse(n);
		if(isPrime(n) && isPrime(reverse) && n!=reverse){
			System.out.println(n+" is a embric number");
		}
		else{
			System.out.println(n+" is not a embric number");
		}
	}
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
			break;
		}
		return true;
	}
	public static int isReverse(int n){
		int sum=0;
		while(n>0){
			sum=sum*10+n%10;
			n=n/10;
		}
		return sum;
	}
}
/*
input:13;
output:13 is a embric number;
*/
