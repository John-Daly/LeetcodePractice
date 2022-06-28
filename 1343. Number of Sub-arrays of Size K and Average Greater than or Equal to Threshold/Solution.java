class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int count = 0;
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        if ((sum / k) >= threshold)
                count++;
        
        for (int end = k; end < arr.length; end++) {
            sum += arr[end];
            sum -= arr[end - k];
            if ((sum / k) >= threshold)
                count++;
        }
        return count;
    }
}
