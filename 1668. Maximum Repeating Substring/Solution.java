class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int count = 0;
        String test = word;
        
        while (test.length() <= sequence.length()) {
            if (sequence.contains(test)) {
                count++;
            }
            test += word;
        }
        return count;
    }
}
