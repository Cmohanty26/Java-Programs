import java.util.Scanner;
class Occurancy 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		while(s.length()>0){
			char ch=s.charAt(0);
			String s1=s.replace(ch+"","");
			int count=s.length()-s1.length();
			System.out.println(ch+"="+count);
			s=s1;
		}
	}
}
