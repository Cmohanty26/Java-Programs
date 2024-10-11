import java.util.Scanner;
class Pattern14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int star=1;
		int space=size/2;
		for(int i=1;i<=size;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");

			}
			for(int j=1;j<=star;j++){
				System.out.print("*");

			}
			if(i<=size/2){
				star++;
				space--;
			}
			else{
				star--;
				space++;

			}
			System.out.println();

		}
	}
}
