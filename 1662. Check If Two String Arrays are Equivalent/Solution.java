class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String addedWord1 = "";
        String addedWord2 = "";
        
        
        for (int i = 0; i < word1.length; i++) {
            addedWord1 += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            addedWord2 += word2[i];
        }
        
        if (addedWord1.equals(addedWord2)) {
            return true;
        }
        return false;
    }
}
