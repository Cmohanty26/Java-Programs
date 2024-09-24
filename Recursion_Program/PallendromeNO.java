import java.util.Scanner;
class PallendromeNO 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n==pallendrome(n,0)){
			System.out.println(n+" is a pallendrome number");
		}
		else{
			System.out.println(n+" is not a pallendrome number");
		}
	}
		public static int pallendrome(int n,int rev){
			if(n==0)return rev;
			rev=rev*10+n%10;
			return pallendrome(n/10,rev);
		}
}
