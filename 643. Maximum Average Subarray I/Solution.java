class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int maxAvg = 0;
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            maxAvg = sum;
        }
        
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxAvg = Math.max(maxAvg, sum);
        }
        
        double avg = maxAvg;
        return avg / k;
    }
}
