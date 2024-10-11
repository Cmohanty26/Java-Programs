import java.util.Scanner;
class HighestPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ending no");
		int end=sc.nextInt();
		System.out.println("Enter the straing  no");
		int st=sc.nextInt();
		for(int j=end;j>=st;j--){
			int n=j;
			int count=0;
			if(n<=1){
				count++;
			}
			for(int i=2;i<=n/2;i++){
				if(n%i==0){
					count++;
					break;
				}
			}
			if(count==0){
				
				System.out.println(j);
				break;
				
			}
			

		}
	}
}
