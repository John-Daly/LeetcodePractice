class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> setS = new HashMap<>();
        HashMap<Character, Integer> setT = new HashMap<>();
        
        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();
        
        for (int i = 0; i < arrayS.length; i++) {
            char key = arrayS[i];
            if (!setS.containsKey(key)){                //If set does not contain the key. Add key to Set.
                setS.put(key, 1);
            } else {
                int value = setS.get(key);              //If set does contain key. Increment value of key. 
                value++;                                //Value relates to amount of times character appears in string.
                setS.put(key, value);
            }
        }
        
        for (int i = 0; i < arrayT.length; i++) {
            char key = arrayT[i];
            if (!setT.containsKey(key)){
                setT.put(key, 1);
            } else {
                int value = setT.get(key);
                value++;
                setT.put(key, value);
            }
        }
        
        if (setS.equals(setT)) {                      //If both sets contain the same keys and values  
            return true;                              //the words can be reassembles to make a new word.
        }                                             //Therefore, anagram. 
        return false;
    }
}
