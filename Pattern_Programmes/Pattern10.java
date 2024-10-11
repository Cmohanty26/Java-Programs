import java.util.Scanner;
class Pattern10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int r=sc.nextInt();
		System.out.println("Enter the colum");
		int c=sc.nextInt();
		for(int i=1;i<=r;i++){
			if(i%2!=0){
				int x=(i-1)*c;
				for(int j=1;j<=c;j++){
					x++;
					System.out.print(x+" ");
				}
			}
			else{
				int x=i*c;
				for(int j=c;j>=1;j--){
					System.out.print(x+" ");
					x--;
				}
			}
			System.out.println();

		}
	}
}
