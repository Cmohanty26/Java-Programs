import java.util.Scanner;
class Pattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int star=1;
		int digit=n-n/2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
		
		if(i<digit){
			star++;
		}
		else{
			star--;
		}
			}
	}
}
