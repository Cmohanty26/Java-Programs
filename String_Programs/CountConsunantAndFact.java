import java.util.Scanner;
class CountConsunantAndFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u' ){
				count++;
			}
		}
		System.out.println("The total consunant is: "+ count);
		int n=count;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact*=i;

		}
		System.out.println("The factorial of total consunat string is: "+fact);
	}
}
/*
input:"chandan";
output:
The total consunant is: 5
The factorial of total consunat string is: 120
*/