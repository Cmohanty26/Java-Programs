import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class ValidPassWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&$%()^]).{4,12}";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		if(m.matches()){
			System.out.println("Valid Password");
		}
		else{
			System.out.println("Invalid Password");
		}

	}
}
