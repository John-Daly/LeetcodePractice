class Solution {
    public int[] runningSum(int[] nums) {
        int[] buffer = new int[1];
        int[] rolling = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            buffer[0] += nums[i];
            rolling[i] = buffer[0];
        } return rolling;
    }
}
