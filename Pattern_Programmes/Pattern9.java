import java.util.Scanner;
class Pattern9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				int x=(i-1)*n;
				for(int j=1;j<=n;j++){
					x++;
					System.out.print(x+" ");
				}
			}
			else{
				int x=i*n;
				for(int j=n;j>=1;j--){
					System.out.print(x+" ");
					x--;
				}
			}
			System.out.println();
		}
	}
}
