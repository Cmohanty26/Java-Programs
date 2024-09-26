import java.util.Scanner;
class MissingVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String vowel="aeiou";
		for(int i=0;i<vowel.length();i++){
			char c=vowel.charAt(i);
			if(!(s.contains(c+""))){
				System.out.print(c);
			}
		}
	}
}
/*
input:"jspiders";
output:aou
*/
