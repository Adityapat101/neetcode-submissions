class Solution {
    public int majorityElement(int[] nums) 
    {

        // [5,5,2,2,4, 3, 2,1, 2]

        int candidate = 0;
        int count = 0;

        for (int i : nums) 
        {
           if(count == 0)
           {
             candidate = i;
           }

           if(candidate == i)
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        return candidate;
    }
}