import java.util.Scanner;
class OccuranceOfSentence 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s=sc.nextLine();
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
			System.out.println(c[i]+"="+count);
			
		}
		
		
	}
}
/*
input:java java
output:j=2,a=4,v=2,-2
*/
