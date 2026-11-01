class Solution 
{
    public int maxFrequency(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int l = 0;

        int s = 0;
        int r = 0;

        while(r < nums.length)
        {
            s+=nums[r];

            int a = nums[r] * (r-l+1) - s;

            if(a > k)
            {
                s-=nums[l];
                l++;
            }

            r++;
        }

        return r-l;
    }
}