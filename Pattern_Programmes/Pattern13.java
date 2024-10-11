import java.util.Scanner;
class Pattern13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++){
			if(i%2!=0){
				for(int j=1;j<=size;j++){
					System.out.print(j+" ");
				}
			}
			else{
				for(int j=size;j>=1;j--){
					System.out.print(j+" ");

				}
			}
			System.out.println();
		}
	}
}
