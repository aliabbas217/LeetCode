class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0; i< arr.length; i++)
        {
            int remainder = arr[i] % 2;
            count = ++count * remainder;
            if(count == 3)
                return true;
        }
        return false;
    }
}