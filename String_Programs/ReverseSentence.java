import java.util.Scanner;
class ReverseSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String s2="";
		int i=0;
		while(i<s.length()){
			int j=i;
			while(j<s.length() && s.charAt(j)!=' '){
				j++;


			}
			for(int k=j-1;k>=i;k--){
				s2=s.charAt(k)+s2;
			}
			if(j<s.length()){
				s2=" "+s2;
			}
			i=j+1;
		}
		System.out.println(s2);

	}
}
/*
input:"java is easy";
output:easy is java;
*/