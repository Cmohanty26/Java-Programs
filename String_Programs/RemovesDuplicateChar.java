import java.util.Scanner;
class  RemovesDuplicateChar
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		String res="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='\u0000'){
				continue;
			}
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					c[j]='\u0000';
				}
			}
			res+=c[i];
		}
		System.out.println(res);
	}
}
/*
input:jaaavaa;
output:jav;
*/