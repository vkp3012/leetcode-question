// 35. Search Insert Position
// Easy

// 8152

// 419

// Add to List

// Share
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
 

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104


public class search_insert_position{

    public static int searchInsertPosition(int arr[],int target){
        
        if(arr == null || arr.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while(left <= right){

            //find mid
            int mid = (right+left)/2;

            if(target == arr[mid]){
                return mid;

            }else if(target < arr[mid]){
                right = mid - 1;

            }else if(target > arr[mid]){
                left = mid +1;

            }else{
                return mid;
            }
            
        }
        return left;
    }
    public static void main(String args[]){
        int arr[] = {1,3,5,6};
        int target = 7;

        int result = searchInsertPosition(arr,target);
        System.out.println(result);
    }
}