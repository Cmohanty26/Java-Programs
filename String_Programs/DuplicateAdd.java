import java.util.Scanner;
class DuplicateAdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
		String s1="";
		char[] c=s.toCharArray();
		char count='1';
		for(int i=1;i<c.length;i++){
			if(c[i-1]!=c[i]){
				s1+=c[i-1];
				if(count!='1')
					s1+=count;
				count='1';
			}
			else{
				count++;
			}
		}
		s1+=c[c.length-1];
		if(count!='1')
			s1+=count;
		System.out.println(s1);
	}
}
