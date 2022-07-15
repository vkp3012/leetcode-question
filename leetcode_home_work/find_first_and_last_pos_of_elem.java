// 34. Find First and Last Position of Element in Sorted Array
// Medium

// 11033

// 302

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


public class find_first_and_last_pos_of_elem{
    
    public static int[] searchRange(int[] nums, int target) {
        int start = findFirstOccurenceIndex(nums, target);
        int end = findLastOccurenceIndex(nums, target);
        
        int[] res = new int[2];
        res[0] = start;
        res[1] = end; 
        return res;
    }
    
     public static int findFirstOccurenceIndex(int[] nums, int k){
         
        int low = 0, high = nums.length-1;
        int index = -1;
         
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(nums[mid] == k){
                index = mid;
                high = mid-1;
                
            }else if(nums[mid]>k){
                high = mid-1;
                
            }else{
                low = mid+1;
            }
        }
        return index;
    }
    
    public static int findLastOccurenceIndex(int[] nums, int k){
        
        int low = 0, high = nums.length-1;
        int index = -1;
        
        while(low <= high){
            int mid = low+(high-low)/2;
            
            if(nums[mid] == k){
                index = mid;
                low = mid + 1;
                
            }else if(nums[mid]>k){
                high = mid - 1;
                
            }else{
                low = mid + 1;
            }
        }
        return index;
    }

    public static void main(String args[]){
        int arr[] = {5,7,7,8,8,10};
        int target = 8;

        int result[] = searchRange(arr,target);
        System.out.print(result);

    }

    @Override
    public String toString() {
        return "find_first_and_last_pos_of_elem []";
    }
}