# DerivativeSolver
This Java program is a brute force solution to a specific mathematical problem. It seeks four distinct integers (a, b, c, d) from 1 to 9 that satisfy certain conditions related to the derivatives of two functions at x = 0.

This task was assigned by my AP Calculus teacher, who challenged me to satisfy the following criteria:
1. Find ddistinct integers for a, b, c, and d ranging from 1 to 9.
2. For the function h(x) = (ax + b) * (cx + d), the derivative at x = 0, should be 24.
3. For the function j(x) = (ax + b) / (cx + d), the derivative at x = 0, should be 3.

To solve this, I developed a Java program that uses a brute force approach. It iterates over all possible combinations of a, b, c, and d. For each combination, it checks if the conditions for h'(0) and j'(0) are met. If a valid combination is found, the program prints the solution. This approach ensures that all possible combinations are explored, and the correct solution is found if it exists. This project is a great example of applying programming skills to solve complex mathematical problems and demonstrates the power of computational thinking in finding solutions that would be time-consuming to calculate manually.
