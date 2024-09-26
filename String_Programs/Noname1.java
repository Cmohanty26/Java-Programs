import java.util.Scanner;
class AddOnlyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int sum=0;
		char[] c=s.toCharArray();
		for(char ch:c){
			if(ch>='a' && ch<='z'){
				sum+=ch-'0';
			}
		}
		System.out.println(sum);
	}
}
