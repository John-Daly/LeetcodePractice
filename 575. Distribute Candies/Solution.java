class Solution {
    public int distributeCandies(int[] candyType) {
        
        int eat = candyType.length / 2;
        
        HashSet<Integer> candyCount = new HashSet<>();
        for (int i : candyType) {
            candyCount.add(i);                      //Assign values in candyType array to the set. 
        }                                           //Only non duplicates are assigned. 
                                                    //HashSet.size() will then give total amount of candies available to eat.
        if (eat < candyCount.size()) {
            return eat;
        } else if (eat == candyCount.size()) {
            return eat;
        } else return candyCount.size();
        
    }
}
