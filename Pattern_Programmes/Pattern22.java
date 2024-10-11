import java.util.Scanner;
class Pattern22 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lines");
		int lines=sc.nextInt();
		int n=2;
		boolean flag;
		for(int i=1;i<=lines;i++){
			for(int j=1;j<=i;j++){
				while(true){
					flag=true;
					for(int k=2;k<=n/2;k++){
						if(n%k==0){
							flag=false;
							break;
						}
					}
					if(flag){
						System.out.print(n+"\t");
						n++;
						break;
					}
					n++;
				}
			}
			System.out.println();
		}

	}
}
