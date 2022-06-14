class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();           //HashSet only stores non-duplicate values;
        
        for (int i = 0; i < nums.length; i++) {       
            set.add(nums[i]);                         //Add elements of Array into HashSet
        }
        
        if (set.size() == nums.length){               //If HashSet size and array size are the same. There are no duplicates
            return false;
        } else return true;
    }
}
