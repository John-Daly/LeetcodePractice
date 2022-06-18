class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i = 0;
        int j = matrix[0].length - 1;
        
        /*
        Constraints state that 2D array is sorted in increasing order
        and first element of each row is larger than last element of
        previous row.
        
        With these contraints we only need to search for the row 
        that our target number is in and do not need to search
        through every element of array. Loop below searches for a matching 
        number at the last element in each row.
        
        If the element matches our target we return true.
        
        Else if the element is larger than our target, the target is 
        somewhere in that row or not at all. We will search backwards (j--) 
        through this whole row looking for a match. 
        
        Else if the element is smaller than our target, the target is not
        in that row and we can move down to the next row (i++) and look 
        for a matching element as stated above.
        */
      
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {           
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }
}
