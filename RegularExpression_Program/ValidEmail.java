import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class ValidEmail 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String exp="[a-z][a-z0-9]+@gmail[.]com";
		Pattern p=Pattern.compile(exp); 
		Matcher m=p.matcher(s);
		if(m.matches()){
			System.out.println("Valid Email");

		}
		else{
			System.out.println("Invalid Email");
		}

		
	}
}
