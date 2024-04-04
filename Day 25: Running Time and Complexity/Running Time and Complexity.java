import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (isPrime(sc.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
    
    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}

