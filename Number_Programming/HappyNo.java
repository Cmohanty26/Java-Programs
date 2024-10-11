import java.util.Scanner;
class HappyNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m=n;
		while(m!=1 && m!=4){
			m=isHappy(m);
		}
		if(m==1){
			System.out.println(n+" is a happy number");
		}
		else{
			System.out.println(n+" is a not happy number");
		}

	}
	public static int isHappy(int n){
		int sq=0;
		while(n!=0){
			int r=n%10;
			sq+=r*r;
			n=n/10;
		}
		return sq;
	}
}
/*
input:13
output:13 is a happy no;
*/