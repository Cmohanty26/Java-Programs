import java.util.Scanner;
class AmstrongNoUsingMathFun 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int len=(n+"").length();
		int sum=0;
		int temp=n;
		while(n>0){
			int digit=n%10;
			sum+=(int) Math.pow(digit,len);
			n=n/10;
		}
		if(sum==temp){
			System.out.println(temp+"  is a amstrong no");
		}
		else{
			System.out.println(temp+"  is not a amstrong no");
		}
	}
}
