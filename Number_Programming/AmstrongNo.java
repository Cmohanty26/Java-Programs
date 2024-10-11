import java.util.Scanner;
class AmstrongNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		int sum=0;
		int temp=n;
		int count=0;
		while(n>0){
			count++;
			n=n/10;
		}
		n=temp;
		while(n>0){
			int digit=n%10;
			int product=1;
			for(int i=1;i<=count;i++){
				product=product*digit;
			}
			sum=sum+product;
			n=n/10;

		}
		if(sum==temp){
			System.out.println("it is a amstrong no");
		}
		else{
			System.out.println("it is not a amstrong no");
		}

	}
}
