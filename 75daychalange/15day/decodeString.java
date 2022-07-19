import java.util.Stack;

// Decode String
// Medium

// 8725

// 378

// Add to List

// Share
// Given an encoded string, return its decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

// The test cases are generated so that the length of the output will never exceed 105.

 

// Example 1:

// Input: s = "3[a]2[bc]"
// Output: "aaabcbc"
// Example 2:

// Input: s = "3[a2[c]]"
// Output: "accaccacc"
// Example 3:

// Input: s = "2[abc]3[cd]ef"
// Output: "abcabccdcdcdef"
 

// Constraints:

// 1 <= s.length <= 30
// s consists of lowercase English letters, digits, and square brackets '[]'.
// s is guaranteed to be a valid input.
// All the integers in s are in the range [1, 300].


public class decodeString{
    /**
     * @param args
     */
    public static void main(String args[]){
        //input....
        String s = "3[a]2[bc]";

        //base case....
        if(s == null || s.length() == 0){
            System.out.print(" ");
        }

        // use stack......
        Stack<StringBuilder>strStack = new Stack<>();
        Stack<Integer>numStack = new Stack<>();

        int num = 0;

        //for efficiency
        StringBuilder currStr = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = num*10 + c - '0';
            }else if(Character.isAlphabetic(c)){
                currStr.append(c);
            }else if(c == '['){
                strStack.push(currStr);
                numStack.push(num);
                num = 0;
                currStr = new StringBuilder();
            }else if(c == ']'){
                int time = numStack.pop();
                StringBuilder newStr = new StringBuilder();

                for(int j = 0;j<time;j++){
                    newStr.append(currStr);
                }

                currStr = strStack.pop().append(newStr);
            }
        }

        System.out.print(currStr.toString());

    }
}