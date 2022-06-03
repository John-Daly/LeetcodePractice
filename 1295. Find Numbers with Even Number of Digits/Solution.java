class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int actions = 0;
        
        
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            while (temp != 0) {
                temp /= 10;
                actions++;
            }
            if (actions % 2 == 0) {
                count++;
                actions = 0;
                
            } else {
                actions = 0;
            }
            
            
        }
        return count;
    }
}
