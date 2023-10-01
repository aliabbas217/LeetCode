class Solution {
    public int[] twoSum(int[] nums, int target) {
        int totalNumbers = nums.length;
        for(int i = 0; i < totalNumbers -1; i++)
        {
            for(int j = i+1; j < totalNumbers; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}