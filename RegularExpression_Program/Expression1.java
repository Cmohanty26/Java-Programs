import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  Expression1
{
	public static void main(String[] args) 
	{
		String s="abcdeadskdabbb";
		String exp="a[a-z]*";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find()){
			System.out.println(m.group());
		}

	}
}
/*
input:"abcdeadskdabbb";
output:"abcdeadskdabbb";
/*
