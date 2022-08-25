class Solution {
    public int majorityElement(int[] nums) {
        
        int element = 0;
        int count = 0;
        int secondCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element){
                count++;
            } else {
                count--;
            }
            
        }
        
        if (count > nums.length / 2) {
            return element;
        } else {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == element) {
                    secondCount++;
                }
            }
            if (secondCount > nums.length / 2) {
                return element;
            }
        }
        return element;
    }
}
