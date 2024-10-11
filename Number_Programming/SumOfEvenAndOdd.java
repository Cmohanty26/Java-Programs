import java.util.Scanner;
class SumOfEvenAndOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sume=0;
		int sumo=0;
		while(n>0){
			int d=n%10;
			if(d%2==0){
				sume+=d;
			}
			else{
				sumo+=d;
			}
			n=n/10;
		}
		System.out.println("The sum of even number is: "+sume);
		System.out.println("The sum of odd number is: "+sumo);
	}
}
