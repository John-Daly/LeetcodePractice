class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (hm.containsKey(search)) {
                result[0] = hm.get(search);
                result[1] = i;
                return result;
            } else {
                hm.put(nums[i], i);
            }
            
            
        }
        return result;
    }
}
