import java.util.Scanner;
class ReverseNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0){
			sum=sum*10+num%10;
			num=num/10;
		}
		System.out.println("The reverse number: "+sum);
	}
}
