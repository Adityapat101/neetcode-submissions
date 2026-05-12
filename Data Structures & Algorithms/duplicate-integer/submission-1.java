class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
       HashSet<Integer> numb = new HashSet<Integer>();

       for (int i = 0; i < nums.length; i++)
       {
            numb.add(nums[i]);
       }

        if(numb.size() == nums.length)
        {
            return false;
        }

        return true;

    }
}