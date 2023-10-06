class Solution {
    public int countOdds(int low, int high) {
        if(low == 0)
            return(high/2) + (high%2);
        if(high == low)
            return high%2;
        if(high%2 == 1 || low%2 == 1)
            return ((high - low) /2) + 1;    
        return ((high - low) /2);
    }
}