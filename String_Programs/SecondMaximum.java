import java.util.Scanner;
class SecondMaximum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char maxChar=' ';
		int maxCount=0;
		char secondMaxChar=' ';
		int secondMaxCount=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			int count=1;
			if(c[i]=='\u0000'){
				continue;
			}
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					count++;
					c[j]='\u0000';
				}
			}
			if(count>maxCount){
				secondMaxCount=maxCount;
				secondMaxChar=maxChar;
				maxCount=count;
				maxChar=c[i];

			}
			else if(count>secondMaxCount && count<maxCount){
				secondMaxCount=count;
				secondMaxChar=c[i];

			}
		}
		System.out.println("Second maximum character: " + secondMaxChar + " = " + secondMaxCount);
	}
}
/*
input:"javaaavvaa";
output:Second maximum character: v=3;
*/