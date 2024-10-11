import java.util.Scanner;
class ConvertBinaryToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(n>0){
			int bit=n%10;
			sum=bit*i+sum;
			i=i*2;
			n=n/10;

		}
		System.out.println("The decimal value is:"+sum);
	}
}
