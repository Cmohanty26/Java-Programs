import java.util.Scanner;
class Pattern12 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++){
			for(int j=1;j<size-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(k+" ");
			}
			for(int l=i-1;l>=1;l--){
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
