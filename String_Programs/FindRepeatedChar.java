import java.util.Scanner;
class FindRepeatedChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String s1="";
		char[] c=s.toCharArray();
		int i=0;
		while(i<c.length){
			char ch=c[i];
			s1+=ch;
			i++;
			while(i<c.length && ch==c[i]){
				s1+=ch;
				i++;

			}
			if(s1.length()>1){
				System.out.println(s1);
			}
			s1="";
		}
	}
}
/*
input=success
output=cc,ss;
/*