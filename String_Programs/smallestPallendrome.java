import java.util.Scanner;
class smallestPallendrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String smallestPallendrome=null;
		for(int i=0;i<s.length();i++){
			for(int j=i+3;j<s.length();j++){
				String str=s.substring(i,j);
				if(isPallendrome(str)){
					if(smallestPallendrome == null || 
						str.length()<smallestPallendrome.length()){
						smallestPallendrome=str;
					}
					System.out.println(str);
				}
			}
		}
		System.out.println("The smallest pallendrome string is: "+smallestPallendrome);
	}
	public static boolean isPallendrome(String s){
		int i=0;
		int j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;

			}
			i++;
			j--;
		}
		return true;

	}

}
