import java.util.Scanner;
class RemovingNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		String res="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]>='0' && c[i]<='9'){
				c[i]='\u0000';
			}
			else{
				res+=c[i];
			}
		}
		System.out.println(res);
	}
}
/*
input:"ja126v89a7";
output:java;
*/
