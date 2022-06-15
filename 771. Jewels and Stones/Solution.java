class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        
        Set<Character> jewelSet = new HashSet<>();
        
        for (char j: jewels.toCharArray()) {           //Breaks down jewel String into array of characters
            jewelSet.add(j);                           //Add the individual characters to the HashSet
        }
        
        for (char s : stones.toCharArray()) {          //Break stone string into array of characters
            if (jewelSet.contains(s))                  //Searches jewel set for matches and increments count
                count++;
        }
        return count;
    }
}
