import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  CountChar
{
	public static void main(String[] args) 
	{
		String s="ababbacdera2c";
		String exp="a..";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find()){
			count++;
		}
		System.out.println(exp+"="+count);
	}
}
/*
input:"ababbacdera2c";
output:a..=3
*/
