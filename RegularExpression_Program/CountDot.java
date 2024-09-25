import java.util.regex.Pattern;
import java.util.regex.Matcher;
class CountDot

{
	public static void main(String[] args) 
	{
		String s="abc.def.ghi.uj";
		String exp="[.]";
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
input:"abc.def.ghi.uj";
output:[.]=3;
*/
