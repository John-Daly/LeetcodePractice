class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0;
        int j = matrix[0].length - 1;
        
        /*
        Constraints state that both rows and columns are sorted in ascending order. 
        We will start the search from that last element in each row. If the target 
        is larger than the element it cannot be in the first row but can still be 
        in the first column. We will increment down to next row (i++). 
        
        If the target is now smaller than the element the target cannot be in the 
        last column. As all further elements in last column will be larger than 
        the target. However, target can still be in this same row. We will decrement(j--)
        the j value to search backwards through row. 
        
        Loop will continue on as stated above until a target is found. Or will return 
        false when no target is found. 
        */
      
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else if (matrix[i][j] < target)
                i++;
        }
        return false;
    }
}
