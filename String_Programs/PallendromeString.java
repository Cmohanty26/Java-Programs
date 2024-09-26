import java.util.Scanner;
class PallendromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		if(isPallendrome(s)){
			System.out.println("It is pallnedrome string");
		}
		else{
			System.out.println("It is not a pallnedrome string");
		}
	}
	public static boolean isPallendrome(String s){
		int i=0;
		int j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;

		}
		return true;
	}
}
