class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        String white = "a2 a4 a6 a8 b1 b3 b5 b7 c2 c4 c6 c8 d1 d3 d5 d7 e2 e4 e6 e8 f1 f3 f5 f7 g2 g4 g6 g8 h1 h3 h5 h7";
        
        if (white.contains(coordinates)){
            return true;
        } else return false;
    }
}
