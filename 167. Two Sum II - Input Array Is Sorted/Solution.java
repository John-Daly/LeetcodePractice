class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        
        while (i < j) {
            int left = numbers[i];
            int right = numbers[j];
            
            if ((left + right) == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            } else if ((left + right) > target) {
                j--;
            } else i++;
            
        }
        return result;
        
    }
}
