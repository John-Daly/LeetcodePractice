class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int copiedIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[copiedIndex] = nums[i];
            copiedIndex++;
        }
        return ans;
    }
}
