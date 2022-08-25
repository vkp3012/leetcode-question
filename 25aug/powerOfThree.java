// 326. Power of Three
// Easy

// 1974

// 191

// Add to List

// Share
// Given an integer n, return true if it is a power of three. Otherwise, return false.

// An integer n is a power of three, if there exists an integer x such that n == 3x.

 

// Example 1:

// Input: n = 27
// Output: true
// Example 2:

// Input: n = 0
// Output: false

public class powerOfThree {

    public static boolean helper(int n){
        if(n < 1){
            return false;
        }

        while(n%3 == 0){
            n = n/3;
        }

        return n == 1;
    }
    
    public static void main(String args[]) {
        
        int n = 27;

        boolean ans = helper(n);
        System.out.println(ans);
    }
}
