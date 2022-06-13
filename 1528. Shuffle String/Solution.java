class Solution {
    public String restoreString(String s, int[] indices) {
        
        char[] sortedS = new char[indices.length];  //New character array to store shuffled values
        
        for(int i = 0; i < indices.length; i++) {
            char letter = s.charAt(i);              //Take relevant letter at index[i] of original String array
            int key = indices[i];                   //Key is the index position in the new shuffled array
            sortedS[key] = letter;                  //Asssign the [i]th letter of original String array to it's new position in shuffled array;
        } 
        return String.valueOf(sortedS);
        
    }
}
