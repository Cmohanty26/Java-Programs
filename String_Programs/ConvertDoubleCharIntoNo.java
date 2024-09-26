import java.util.Scanner;
class ConvertDoubleCharIntoNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string no");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			char count='2';
			if(ch[i]>='0' && ch[i]<='9'){
				continue;
			}
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					ch[j]=count;
					count++;
				}
			}
			if(count!='2'){
				ch[i]='1';

			}
		}
		System.out.println(ch);
	}
}
/*
input:hello world
output:he121 w2r3d
*/