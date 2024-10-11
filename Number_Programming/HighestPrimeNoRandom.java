import java.util.Scanner;

class HighestPrimeNoRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int max = -1;
        
        while (n > 0) {
            int digit = n % 10; 
            if (isPrime(digit)) {
                if (digit > max) {
                    max = digit; 
                }
            }
            n = n / 10; 
        }

        if (max == -1) {
            System.out.println("No prime digit found");
        } else {
            System.out.println("The highest prime digit is: " + max);
        }
        
        sc.close();
    }

   
    public static boolean isPrime(int digit) {
        if (digit <= 1) return false; 
        for (int i = 2; i <= digit / 2; i++) {
            if (digit % i == 0) return false; 
        }
        return true; 
    }
}
