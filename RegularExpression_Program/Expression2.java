import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Expression2 
{
	public static void main(String[] args) 
	{
		String s="abscabcdefabf";
		String exp="a..";

		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}
		
	}
}
