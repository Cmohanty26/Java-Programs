import java.util.Scanner;
class SumRandom 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sum=0;
		/*do{
			while(n>0){
				sum+=n%10;
				n=n/10;
			}
			n=sum;
			sum=0;
		}
		
		while(n>9);
			System.out.println("The sum is:"+n);*/
			while(n>0){
				sum+=n%10;
				n=n/10;
				if(n==0 && sum>9){
					n=sum;
					sum=0;
				}
			}

		System.out.println("The sum is:"+sum);
		
	}
}
