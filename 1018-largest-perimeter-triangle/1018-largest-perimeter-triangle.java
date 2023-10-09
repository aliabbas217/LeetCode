class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int a = nums.length - 1; a >= 2 ; a--)
            if(nums[a] < nums[a-1]+ nums[a-2])
                return nums[a]+ nums[a-1] + nums[a-2];
        return 0;
    }
}