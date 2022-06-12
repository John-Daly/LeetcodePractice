class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int m = matrix.length;            //length of column
        int n = matrix[0].length;         //length of row
        
        int[][] transMatrix = new int[n][m];  //new reshaped 2D Array of n * m size. 
      
      
        //Double loop below takes the first downward column in the original
        //array and assigns it to the first row across in reshaped array.
        //We take matrix[0][0], matrix[1][0], matrix[2][0] and assign it to
        //transMatrix[0][0], transMatrix[0][1], transMatrix[0][2].
        //If original 2D Array is
        //[1][2][3]
        //[4][5][6]
        //[7][8][9]
        //First downward column is
        //[1]
        //[4]
        //[7]
        //Then first row of transMatrix is
        //[1][4][7]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transMatrix[i][j] = matrix[j][i];
            }
        }
        return transMatrix;
    }
}
