import java.util.Scanner;
class Boss 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string name");
		String s=sc.next();
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					c[j]='$';
					break;
				}
			}
		}
		System.out.println(c);
	}
}
