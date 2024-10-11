import java.util.Scanner;
class  PrimeNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		/*boolean flag=true;
		if(n<=1){
			flag=false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				flag= false;
			}
		if(flag){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}*/
		if(n<=1){
			count++;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				count++;
		}
		if(count==0){
			System.out.println(n+" is a prime number");
		}
		else{
			System.out.println(n+" is not a prime number");
		}

	}
}
/*
input:13;
output:13 is a prime no;
*/
