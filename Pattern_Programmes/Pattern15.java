import java.util.Scanner;
class Pattern15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int sum=0;
		for(int i=1;i<=size;i++){
			sum=sum+i;
			if(i%2!=0){
				int num=sum-i;
				for(int j=1;j<=i;j++){
					num++;
					System.out.print(num+" ");
				}
			}
			else{
				int num=sum;
				for(int j=1;j<=i;j++){
					System.out.print(num+" ");
					num--;
				}

			}
			System.out.println();
		}
	}
}
