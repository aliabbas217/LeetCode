class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int i = 0; i< nums.length; i++)
        {
            if(visited[nums[i]] == false){
                visited[nums[i]] = true;
                continue;
            }
            return nums[i];
        }
        return -1;
    }
}