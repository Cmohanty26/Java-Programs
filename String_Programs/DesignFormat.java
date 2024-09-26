import java.util.Scanner;
class DesignFormat 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String lc="";
		String uc="";
		String nc="";
		String sp="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z'){
				lc+=c;
			}
			else if(c>='A' && c<='Z'){
				uc+=c;
			}
			else if(c>='0' && c<='9'){
				nc+=c;
			}
			else{
				sp+=c;
			}
			
		}
		s=lc+uc+nc+sp;
			System.out.println(s);
	}
}
/*
input=jsp@123#OAR
output=jspOAR123@#
/*
