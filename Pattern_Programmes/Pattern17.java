import java.util.Scanner;
class Pattern17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int star=1;
		int space=size-1;
		for(int i=1;i<=size;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();

		}
	}
}
