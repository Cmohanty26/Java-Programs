import java.util.Scanner;
class SortedString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			char temp=' ';
			for(int j=i;j<c.length;j++){
				if(c[i]>c[j]){
					temp=c[j];
					c[j]=c[i];
					c[i]=temp;
				}
			}
		}
		System.out.println(c);
	}
}
/*
input:"aAbB";
output:ABab;
*/