// 34. Find First and Last Position of Element in Sorted Array
// Medium

// 10826

// 298

// Add to List

// Share
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109


public class firstAndLastPostionOfElem{

    public static int[] searchRange(int[] nums, int target) {
        
        if(nums == null || nums.length == 0){
           return new int[]{-1,-1};
       }
       
       int left = 0;
       int right = nums.length;
       // int mid = 0;
       while(left<=right){
           int mid = left+(right-left)/2;
           
           if(nums[mid] == target){
               int i = mid;
               int j = mid;
               
               while (i > 0 && nums[i - 1] == target) { //Find lower boundary 
                   i--;
               }
               
               while (j < nums.length - 1 && nums[j + 1] == target) { //Find upper boundary 
                   j++;
               }
               
               return new int[] {i, j};
               
           }else if(nums[mid]<target){
               left = mid + 1;
               
           }else{
               right = mid - 1;
           }
       }
       return new int[]{-1,-1};
   }
   
    public static void main(String args[]){
        int[] arr = {2,2};
        int target = 3;
        int[] result = searchRange(arr,target);
        System.out.println(result);
    }

}