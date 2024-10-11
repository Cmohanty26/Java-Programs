import java.util.Scanner;
class CalculateBill 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the unit");
		int unit=sc.nextInt();
		double bill=0;
		if(unit<=20){
			bill=0*unit;
		}
		else if(unit<=70){
			bill=(unit-20)*2;
		}
		else if(unit<=100){
			bill=2*50+(unit-70)*4;
		}
		else if(unit<=130){
			bill=2*50+4*30+(unit-100)*7;
		}
		else if(unit>130){
			bill=2*50+4*30+7*30+(unit-130)*15;
		}
		System.out.println("The total bill is: "+bill);
	}
}
