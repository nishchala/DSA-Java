import java.util.Scanner;
/* Problem  - Find the prime factors of a number
Brute Force - starting i from 2 to N, divide the given number completely with i,
here i will be prime number since its multiples will not be reached
since we are multiplying the number with i until it is not divisible with it anymore.
Time complexity - O(N) as for prime number, the outer loop will run from 2 to N.

Optimised solution - Run the loop from 2 to sqrt(N) times and print the prime factors.
If the last number remains > 1, then its the last prime factor.
Time complexity - O(sqrt(N))
 */

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int N = input.nextInt();
        printPrimeFactorsOfN(N);

    }

    public static void printPrimeFactorsOfN(int N) {
        int p = 2;
        System.out.println("Prime Factors of given number: ");
        while(p*p<=N) {
            while(N%p==0){
                System.out.print(p + " ");
                N = N/p;
            }
            p++;
        }
        if(N>1){
            System.out.print(N);
        }
    }

}
