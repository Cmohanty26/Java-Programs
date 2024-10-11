import java.util.Scanner;
class SecondHighestPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ending number");
		int end=sc.nextInt();
		System.out.println("Enter the staring number");
		int st=sc.nextInt();
		int primeCount=0;
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
				primeCount++;
				if(primeCount==2){
					System.out.println(j);
					break;
				}
			}
		}
	}
}
