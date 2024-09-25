import java.util.regex.Pattern;
import java.util.regex.Matcher;
class Expression3 
{
	public static void main(String[] args) 
	{
		String s="aba\\ab\nvgf\\";
		String exp="\\\\";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}


	}
}
/*
input:"aba\\ab\nvgf\\";
output:
\
\
*/