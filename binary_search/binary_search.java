import java.util.Arrays;

//  Binary Search

// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4
// Example 2:

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1
 

// Constraints:

// 1 <= nums.length <= 104
// -104 < nums[i], target < 104
// All the integers in nums are unique.
// nums is sorted in ascending order.

public class binary_search{
  

    public static int serach(int arr[],int left, int right,int target){
        // int foundAt = -1;

        while(left<right){
            int mid = left+(right-left)/2;

            if(target == arr[mid]){
                return  mid;
            }else if(target > arr[mid]){
                left = mid + 1;
            }else if(target < arr[mid]){
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int arr[] = {-1,0,3,5,9,12};
        
        
        int target = 9; 
        int right = arr.length - 1; 
        // int foundAt = -1;
        int result = serach(arr,0,right,target);

        if (result == -1){
            System.out.println("Element is not found!");  
        }else{
            System.out.println("Element is found at index: "+result);  
        }  
    }

    public static int distance_value_btn_two_arr(int arr1[],int arr2[],int d){
        Arrays.sort(arr2);
        int res = arr1.length;
        for(int num: arr1){
            int left = 0;
            int right = arr2.length - 1;
            while(left<=right){
                int mid = left + (right-left)/2;
                
                if(Math.abs(num - arr2[mid])<=d){
                    res--;
                    break;
                }else if(num<arr2[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return res;
        
    }
}
