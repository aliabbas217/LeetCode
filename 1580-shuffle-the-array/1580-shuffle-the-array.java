class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x = 1;
        int y = n;
        int i = 1;
        int[] toReturn = new int[2*n];
        toReturn[0] = nums[0];
        while(i < 2*n)
        {
            if(i%2 == 0)
            {
                toReturn[i] = nums[x];
                x++;
            }
            else
            {
                toReturn[i] = nums[y];
                y++;
            }
            i++;
        }
        return toReturn;
    }
}