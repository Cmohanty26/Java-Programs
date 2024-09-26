import java.util.Scanner;
class CountTheCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int lc=0;
		int uc=0;
		int nc=0;
		int sp=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c>='a' && c<='z'){
			lc++;
			}
			else if(c>='A' && c<='Z'){
			uc++;
			}
			else if(c>='0' && c<='9'){
			nc++;
			}
			else {
			sp++;
			}
		}
		System.out.println("The lower case total no is: "+lc);
		System.out.println("The upper case total no is: "+uc);
		System.out.println("The number case total no is: "+nc);
		System.out.println("The special case total no is: "+sp);
	}
}
/*
input="abcABC123@#%de";
output:
The lower case total no is: 5
The upper case total no is: 3
The number case total no is: 3
The special case total no is: 3
*/