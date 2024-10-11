import java.util.Scanner;
class Pattern23 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int space = size - 1; 
        
        for (int i = 1; i <= size; i++) {
            
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println(); 
            space--;
        }
    }
}
