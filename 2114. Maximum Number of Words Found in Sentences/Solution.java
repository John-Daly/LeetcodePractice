class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String[] sentenceArray = sentence.split(" ");
            if (sentenceArray.length > max) {
                max = sentenceArray.length;
            }
        }
        return max;
    }
}
