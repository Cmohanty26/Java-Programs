import java.util.Scanner;
class StrongNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int digit=0;
		while(n>0){
			digit=n%10;
			int fact=1;
			for(int i=1;i<=digit;i++){
				fact=fact*i;

			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp){
			System.out.println("it is a strong no");
		}
		else{
			System.out.println("it is not a strong no");
		}
	}
}
