import java.util.Scanner;
class CurrencyCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int amt=sc.nextInt();
		if(amt>=2000){
			System.out.println("2000 x "+ amt/2000);
			amt%=2000;
		}
		if(amt>=500){
			System.out.println("500 x "+ amt/500);
			amt%=500;
		}
		if(amt>=200){
			System.out.println("200 x "+ amt/200);
			amt%=200;
		}
		if(amt>=100){
			System.out.println("100 x "+ amt/100);
		}
		

	}
}
/*
input:6700;
output:
2000 x 3
500 x 1
200 x 1
*/