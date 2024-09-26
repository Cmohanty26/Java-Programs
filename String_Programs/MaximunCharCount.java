import java.util.Scanner;
class MaximunCharCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		char maxChar=' ';
		int maxCount=0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			int count=1;
			if(c[i]==('\u0000')){
				continue;
			}
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					count++;
					c[j]='\u0000';
				}
			}
			if(count>maxCount){
				maxCount=count;
				maxChar=c[i];
			}
		}
		System.out.println(maxChar+"="+maxCount);
	}
}
/* 
input:java is java 
output:a=4;
*/
