/*
If s = abcde and goal = cdeab,
s + s will give us the result abcdeabcde.
If goal is a rotator of s, goal will appear in new (s + s) string.
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        } else if ((s + s).contains(goal)) { 
            return true;
        } else return false;
        
    }
}
