class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int count = 0;
        int index = pref.length();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() >= index) {
                if (word.substring(0,index).equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }
}
