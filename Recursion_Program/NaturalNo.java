import java.util.Scanner;
class NaturalNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int end=sc.nextInt();
		display(1,end);

	}
	static void display(int n,int end){
		if(n>end)return;
		System.out.print(n + " ");
		display(n+1,end);

	}


}
