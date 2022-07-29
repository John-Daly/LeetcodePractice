class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        
        while (i < j) {
            int left = height[i];
            int right = height[j];
            
            if ((Math.min(left, right) * (j - i)) > max) {
                max = (Math.min(left, right) * (j - i));
            } else if (left < right) {
                i++;
            } else j--;
            
        }
        return max;
    }
}
