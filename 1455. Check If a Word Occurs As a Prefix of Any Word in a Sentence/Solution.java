/*
Steps:
Split sentence into an array of words without spaces. 
Within for loop, check if word at index i is greater than or equal to
the searchWord. If true we will compare searchWord with the first n 
characters of the word at index i. n being the length of the searchWord.

*/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            String value = sentenceArray[i];
            if (value.length() >= searchWord.length()  
                && value.substring(0, (searchWord.length())).contains(searchWord)) {
                return i + 1;
            }
        } return -1;
    }
}
