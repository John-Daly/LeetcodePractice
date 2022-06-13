class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] words = s.split("\\s+");     //Creates an array of the words in the original String s. Splits sentence by the spaces.
        int lastIndex = words.length - 1;     //We want the last word in the sentence. Last word will be the last index in the new String array.
        return words[lastIndex].length();     //Return the length of the word in the last index of the new String array. 
    }
}
