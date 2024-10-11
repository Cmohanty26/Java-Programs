import java.util.Scanner;
class Pattern20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int star=size;
		int space=1;
		for(int i=1;i<=size;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			
			star-=2;
			space++;
			System.out.println();

		}
	}
}
