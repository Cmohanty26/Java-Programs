import java.util.Scanner;
class MissingAlphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		String alpha="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<alpha.length();i++){
			char c=alpha.charAt(i);
			if(!s.contains(c+"")){
				System.out.print(c+" ");

			}
		}
	}
}
/*
input:"chandan";
output:b e f g i j k l m o p q r s t u v w x y z;
*/
