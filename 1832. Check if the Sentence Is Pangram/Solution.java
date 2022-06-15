class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> pangram = new HashSet<>();
        
        for (char s : sentence.toCharArray()) {         //Break string into character array and assign values to set. 
            pangram.add(s);                             //Set will only take non duplicates. 
        }
        
        if (pangram.size() == 26) {                     //If set size is 26 we have all letters of alphabet. 
            return true;
        } else return false;
    }
}
