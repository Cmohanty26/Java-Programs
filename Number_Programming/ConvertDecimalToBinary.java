import java.util.Scanner;
class ConvertDecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		int binary=0;
		while(n>0){
			int bit=n%2;
			binary=bit*i+binary;
			i=i*10;
			n=n/2;


		}
		System.out.println(binary);
		
	}
}
