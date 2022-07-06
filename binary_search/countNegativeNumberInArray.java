

// 1351. Count Negative Numbers in a Sorted Matrix

// Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

 

// Example 1:

// Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
// Output: 8
// Explanation: There are 8 negatives number in the matrix.
// Example 2:

// Input: grid = [[3,2],[1,0]]
// Output: 0
 

// Constraints:

// m == grid.length
// n == grid[i].length
// 1 <= m, n <= 100
// -100 <= grid[i][j] <= 100


public class countNegativeNumberInArray{

    public static int countNegativeNumberInArrays(int[][] grid){
        // Arrays.sort(arr);
        // int count = 0;

        //first method
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;

        //method two
        // int count = 0;   
        // int result = 0;  
        // for(int i = 0; i<grid.length; i++){          
        //     int left = 0;
        //     int right = grid[0].length-1;
            
        //     while(left<=right){
                
        //         int mid = left + (right-left)/2;
                
        //         if(grid[i][mid]<0){
        //             count = grid[0].length - mid;
        //             right = mid -1;
        //         }
        //         else if(grid[i][mid] >= 0){
        //             left = mid+1;
        //         }   
        //     }
        //     result += count;
        // }
        // return result;
    }
   
    public static void main(String args[]){
        int[][] arr = {{4,3,2,-1},{3,2,-1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        
        int result = countNegativeNumberInArrays(arr);
        System.out.println(result);

    }
}