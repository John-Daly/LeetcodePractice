/*
Merge sort solution accepted but memory usage was woeful. 
Will return with better algorithm when I learn it. 
Most likely not the best solution for this question.
*/

class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
    
    void mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];
        
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = arr[i];
            
        }
        
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }
    
    void merge(int[] arr, int[] left, int[] right) {
        
        int newLeft = left.length;
        int newRight = right.length;
        int i = 0, j = 0, k = 0;
        while(i < newLeft && j < newRight) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        while (i < newLeft) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < newRight) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
