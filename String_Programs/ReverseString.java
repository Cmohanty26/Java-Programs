import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String s1="";
		/*for(int i=0;i<s.length();i++){
			s1=s.charAt(i)+s1;*/
			for(int i=s.length()-1;i>=0;i--){
			s1+=s.charAt(i);
		}
		System.out.println(s1);
	}
}
