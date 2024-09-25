import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class ValidMobileNumber 
{
	public static void main(String[] args) 
		
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mobile number");
		String s=sc.next();
		String exp="[9876][0-9]{9}";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches()){
			System.out.println("Valid Mobile Number");
		}
		else{
			System.out.println("Invalid Mobile Number");
		}
		
	}
}
