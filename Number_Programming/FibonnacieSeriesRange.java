import java.util.Scanner;
class FibonnacieSeriesRange  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		
			int a=0;
			int b=1;
			System.out.print(a+" "+b+" ");
			for(int i=3;i<=range;i++){
				int c=a+b;
				if(c>=range){
					break;
				}
				System.out.print(c+" ");
				a=b;
				b=c;
			
		}
	}
}
