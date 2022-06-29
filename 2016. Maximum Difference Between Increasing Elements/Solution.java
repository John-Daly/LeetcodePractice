class Solution {
    public int maximumDifference(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int diff = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min)
                min = nums[i];
            else if (nums[i] - min > diff)
                diff = nums[i] - min;
        }
        return diff == 0 ? -1: diff;
    }
}
