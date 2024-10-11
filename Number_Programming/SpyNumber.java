import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int mult=1;
		while(n>0){
			int bit=n%10;
			sum+=bit;
			mult*=bit;
			n=n/10;
		}
		if(sum==mult){
			System.out.println("it is a spy number");
		}
		else{
			System.out.println("it is not a spy number");
		}
	}
}
