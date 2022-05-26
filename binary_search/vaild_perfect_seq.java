// Valid Perfect Square

// Given a positive integer num, write a function which returns True if num is a perfect square else False.

// Follow up: Do not use any built-in library function such as sqrt.

 

// Example 1:

// Input: num = 16
// Output: true
// Example 2:

// Input: num = 14
// Output: false


public class vaild_perfect_seq{
    public static boolean perfectSeq(int num){

        int left = 0;
        int right = num/2;

        while(left<right){
            int mid = left + (right-left)/2;

            if(mid*mid<num){
                left = mid + 1;
            }else if(mid*mid>num){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int num = 14;
        boolean result = perfectSeq(num);
        System.out.print(result);
    }
}