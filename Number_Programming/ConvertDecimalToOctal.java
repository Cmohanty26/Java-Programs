import java.util.Scanner;
class ConvertDecimalToOctal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(n>0){
			int bit=n%8;
			sum+=bit*i;
			i=i*10;
			n=n/10;
		}
		System.out.println("The octal value is: "+sum);
	}
}
