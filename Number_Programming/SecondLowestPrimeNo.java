import java.util.Scanner;
class SecondLowestPrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting point");
		int st=sc.nextInt();
		System.out.println("Enter the ending point");
		int end=sc.nextInt();
		int primeCount=0;
		for(int j=st;j<=end;j++){
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
			
				System.out.println("The second lowest primeno is: "+j);
				break;
			}
		}
		}

	}
}
