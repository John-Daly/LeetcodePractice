class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = 0;
        while (i < nums.length -1) {
            ans[i] = nums[j];
            ans[i + 1] = nums[n];
            i += 2;
            j++;
            n++;
            
        }
        return ans;
    }
}
