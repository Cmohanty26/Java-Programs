import java.util.Scanner;
class Panagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		if(isPanagram(s)){
			System.out.println("The given string is panagram string");
		}
		else{
			System.out.println("The given string is not a panagram string");
		}
	}
	public static boolean isPanagram(String s){
		s=s.toLowerCase();
		if(s.length()<26){
			return false;
		}
		for(char c='a';c<='z';c++){
		if(s.indexOf(c)==-1){
		return false;
		}
		}
		return true;
	}
}
/*
input:"The quick brown fox jumps over the lazy dog";
output:The given string is panagram string;
*/
