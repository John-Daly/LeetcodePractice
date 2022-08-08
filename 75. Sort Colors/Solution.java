class Solution {
    public void sortColors(int[] nums) {
        
        int zeroInsert = 0;
        int twoInsert = nums.length - 1;
        int i = 0;
        
        while (i <= twoInsert) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[zeroInsert];
                nums[zeroInsert] = temp;
                zeroInsert++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[twoInsert];
                nums[twoInsert] = temp;
                twoInsert--;
            } else {
                i++;
            }
        }
    }
}
