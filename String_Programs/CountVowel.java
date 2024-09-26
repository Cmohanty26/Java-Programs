import java.util.Scanner;
class CountVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int countV=0;
		int countC=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				countV++;


			}
			else{
				countC++;
			}
		}
		System.out.println("The total no of vowel is: "+countV);
		System.out.println("The total no of consumant is: "+countC);
	}
}
