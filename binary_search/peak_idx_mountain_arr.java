//Peak Index in a Mountain Array

// Let's call an array arr a mountain if the following properties hold:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... arr[i-1] < arr[i]
// arr[i] > arr[i+1] > ... > arr[arr.length - 1]
// Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

 

// Example 1:
// Input: arr = [0,1,0]
// Output: 1


// Example 2:
// Input: arr = [0,2,1,0]
// Output: 1

// Example 3:
// Input: arr = [0,10,5,2]
// Output: 1
 

// Constraints:

// 3 <= arr.length <= 104
// 0 <= arr[i] <= 106
// arr is guaranteed to be a mountain array.


// Approach 1: Linear Scan
// Intuition and Algorithm

// The mountain increases until it doesn't. The point at which it stops increasing is the peak.
// class Solution {
//     public int peakIndexInMountainArray(int[] A) {
//         int i = 0;
//         while (A[i] < A[i+1]) i++;
//         return i;
//     }
// }
 

// Approach 2: Binary Search
public class peak_idx_mountain_arr{
  

    public static int serach(int arr[],int left, int right){
        // int foundAt = -1;

        while(left<right){
            int mid = left+(right-left)/2;

            if(arr[mid] < arr[mid+1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

    public static void main(String args[]){

        int arr[] = {0,0,0}; 
        int right = arr.length - 1; 
        int result = serach(arr,0,right);

        if (result == 0){
            System.out.println("Element is not found!");  
        }else{
            System.out.println("Element is found at index: "+result);  
        }  
    }
}