import java.util.Scanner;
class PallendromeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			sum=sum*10+num%10;
			num=num/10;
		}
		if(sum==temp){
			System.out.println(temp+" is a pallendrome number");
		}
		else{
			System.out.println(temp+" is not a pallendrome number");
		}

	}
}
