import java.util.Scanner;
/*
Brute force O(n) - Check if number is prime if it is divisible by any number from 2 to n-1


Optimised solution - Check if number is prime if it is divisible by any number from 2 to sqrt of number
* Time complexity is O(sqrt(n))
* */
public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        if(isPrime(number)){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is not prime");
        }

    }

    public static boolean isPrime(int number) {
        int sqrtOfNumber = (int) Math.sqrt(number);
        for(int i = 2; i<=sqrtOfNumber; i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
}
