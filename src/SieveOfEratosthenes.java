/* Problem: find all prime numbers up to any given limit

Brute force - Find if each element from 2 to N is prime or not.
Time complexity : order of number of elements N * sqrt(N)

Optimised solution: Find prime number upto number N using sieve of eratosthenes,
 by marking the multiples of each number from 2 to sqrt N as non-prime
 */

import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto which we want to find prime numbers: ");
        int N = input.nextInt();

        int[] result = sieveOfEratosthenes(N);
        System.out.println("Prime numbers from 1 to " + N + " are : ");
        for(int i=1; i<result.length; i++) {
            if(result[i] == 1)
                System.out.print(i + " ");
        }
    }
    private static int[] sieveOfEratosthenes(int number) {
        int[] prime = new int[number+1];
        for(int i = 0; i<prime.length; i++) {
            prime[i] = 1;
        }
        int i = 2;
        int sqrtN = (int) Math.sqrt(number);
        while(i<=sqrtN) {
            for(int j=i*2;j<=number;j+=i) {
                prime[j] = 0;
            }
            i++;
        }
        return prime;
    }
}
