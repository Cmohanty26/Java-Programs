import java.util.Scanner;
class AutomorphicNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sq=n*n;
		boolean flag=true;
		while(n>0){
			if(n%10!=sq%10){
				flag=false;
			break;
			}
		
		n=n/10;
		sq=sq/10;
		}
		if(flag){
			System.out.println("It is an automorphic no");
		}
		else{
			System.out.println("It is not an automorphic no");
		}
	}
}
