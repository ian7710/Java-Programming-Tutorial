public class FizzBuzz {
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        int n = 20; // Example: print numbers from 1 to 20
        fizzBuzz(n);
    }
}

// Explanation:
// fizzBuzz(int n) Method:

// This method takes an integer n as a parameter. It iterates through numbers from 1 to n using a for loop (for (int i = 1; i <= n; i++)).
// FizzBuzz Logic:

// Inside the loop, it checks each number i:
// FizzBuzz Condition: If i is divisible by both 3 and 5 (i % 3 == 0 && i % 5 == 0), it prints "FizzBuzz".
// Fizz Condition: Else if i is divisible only by 3 (i % 3 == 0), it prints "Fizz".
// Buzz Condition: Else if i is divisible only by 5 (i % 5 == 0), it prints "Buzz".
// Default Case: If none of the above conditions are true (i.e., i is neither divisible by 3 nor 5), it simply prints the number i.
// main(String[] args) Method:

// This is the entry point of the program. It initializes an integer n with the value 20.
// It then calls the fizzBuzz(int n) method with n as an argument (fizzBuzz(n)), which executes the FizzBuzz logic and prints the appropriate outputs based on the conditions defined in the fizzBuzz method.