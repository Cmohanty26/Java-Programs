import java.util.Scanner;
class Pattern25 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++){
			int count=i+1;
			for(int j=0;j<=n;j++){
				System.out.print(count++ +"\t");
			}
			System.out.println();
			
		}
	}
}
