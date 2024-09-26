import java.util.Scanner;
class possiblePallendrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string name");
		String s=sc.next();
		for(int i=0;i<s.length()-1;i++){
			for(int j=i+3;j<s.length();j++){
				String str=s.substring(i,j);
				if(isPallendrome(str)){
					System.out.println(str);

				}


			}
		}

	}
	public static boolean isPallendrome(String s){
		int i=0;
		int j=s.length()-1;
		if(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
