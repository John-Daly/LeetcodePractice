class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }
        
        int reverse = 0;
        int number = x;
        
        while (number != 0){
            
            int lastDigit = number % 10;
            
            reverse *= 10;
            
            reverse += lastDigit;
            
            number /= 10;
            
            
        } 
        
        return reverse == x;
    } 
}
