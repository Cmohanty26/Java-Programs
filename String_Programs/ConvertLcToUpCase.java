import java.util.Scanner;
class ConvertLcToUpCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='a' && c<='z'){
				c-=32;
			}
			else if(c>='A' && c<='Z'){
				c+=32;
			}
			System.out.print(c);
		}
	}
}
