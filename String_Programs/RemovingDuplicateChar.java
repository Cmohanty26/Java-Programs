import java.util.Scanner;
class RemovingDuplicateChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name");
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(s1.indexOf(ch)==-1){
				s1+=ch;
			}
		}
		System.out.println(s1);
	}
}
/*
input:jaavaava
output:jav
*/