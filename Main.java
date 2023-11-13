/*
Problem: We want to find distinct integers a, b, c, d from 1-9 such that
the derivative of h(x) = (ax + b) * (cx + d) at x = 0 is 24
and the derivative of j(x) = (ax + b) / (cx + d) at x = 0 is 3.

Note: 
f(x) = ax + b; 
g(x) = cx + d;
h'(x) = f'(x)g(x) + f(x)g'(x);
j'(x) = (f'(x)g(x) - f(x)g'(x)) / (g(x))^2.


Solution: We use a brute force approach to iterate over all possible values of a, b, c, d.
For each combination, we check if the conditions for h'(0) and j'(0) are satisfied.
If they are, we print out the solution.

Note: 
h'(0) = ad + bc = 24;
j'(0) = (ad - bc) / d^2 = 3;
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        boolean found = false; // Add a boolean variable to track if a solution is found

        // Iterate over all possible values of b, c, and d
        for (int b = 1; b <= 9 && !found; b++) {
            for (int c = 1; c <= 9 && !found; c++) {
                // Check if b*c is even, as this is a necessary condition for the equations to hold
                if (b != c && (b * c) % 2 == 0) {
                    for (int d = 1; d <= 9 && !found; d++) {
                        // Check if the equation for h'(0) holds
                        if (d != b && d != c && (24 - 2 * b * c) == 3 * d * d) {
                            // Calculate a using the equation for j'(0)
                            int a = (24 - b * c) / d;
                            // Check if a, b, c, and d are all distinct and within the range 1-9
                            if (a != b && a != c && a != d && a >= 1 && a <= 9) {
                                // Print out the solution
                                System.out.println("Solution found:");
                                System.out.println("a = " + a);
                                System.out.println("b = " + b);
                                System.out.println("c = " + c);
                                System.out.println("d = " + d);
                                System.out.println("--------------------");
                                found = true; // Set found to true when a solution is found
                            }
                        }
                    }
                }
            }
        }
    }
}