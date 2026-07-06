class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] newNums = new int[2];
        int i = nums.length-1;

        while(i > 0)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if((nums[i] + nums[j] == target) && (i != j))
                {
                    newNums[0] = j;
                    newNums[1] = i;
                    return newNums;
                }
            }
            i--;
        }
        return newNums;
    }
}
