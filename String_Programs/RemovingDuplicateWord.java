import java.util.Scanner;
class RemovingDuplicateWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.nextLine();
		String s1="";
		String[] s2=s.split(" ");
		for(int i=0;i<s2.length;i++){
			if(s1.indexOf(s2[i])==-1){
				s1+=s2[i]+" ";
			}
		}
		System.out.println(s1);
	}
}
/*
input:Happy Birthday Happy;
output:Happy Birthday;
*/