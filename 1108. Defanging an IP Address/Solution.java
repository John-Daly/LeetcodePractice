class Solution {
    public String defangIPaddr(String address) {
        
        String replacedString = address.replace(".","[.]");
        return replacedString;
    }
}
