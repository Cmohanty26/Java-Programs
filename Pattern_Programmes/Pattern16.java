import java.util.Scanner;
class Pattern16 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			for(int j=i+1;j<=size;j++){
				System.out.print(i+1+" ");

			}
			System.out.println();

		}
		
	}
}
