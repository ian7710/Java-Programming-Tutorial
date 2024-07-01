public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        // Check palindrome
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str1 = "level";
        String str2 = "hello";
        
        System.out.println(str1 + " is palindrome? " + isPalindrome(str1));
        System.out.println(str2 + " is palindrome? " + isPalindrome(str2));
    }
}

// Explanation:
// isPalindrome(String str) Method:

// This method takes a string str as input and returns true if str is a palindrome, and false otherwise.
// First, it removes all spaces (\\s+) from the string using replaceAll("\\s+", "") and converts the string to lowercase using toLowerCase(). This ensures that the palindrome check is case-insensitive and ignores spaces.
// It then initializes two pointers, left starting from the beginning (0) and right starting from the end (str.length() - 1).
// In the while loop, it compares characters at left and right positions:
// If characters don't match (str.charAt(left) != str.charAt(right)), it returns false, indicating that str is not a palindrome.
// If they match, it moves left pointer forward (left++) and right pointer backward (right--).
// The loop continues until left is less than right, ensuring all characters have been checked.
// If the loop completes without finding any mismatches, it returns true, indicating that str is a palindrome.
// main(String[] args) Method:

// In the main method, two example strings str1 ("level") and str2 ("hello") are tested using the isPalindrome method.
// Results are printed to the console using System.out.println.