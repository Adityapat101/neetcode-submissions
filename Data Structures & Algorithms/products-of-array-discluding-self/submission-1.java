class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int[] output = new int[nums.length];

        int prod = 1; 
        int cont = 0;

        int x = 0;

        while (x < nums.length)
        {
            for (int i = 0; i < nums.length; i++)
            {
                if(i == cont)
                {

                }
                else
                {
                    prod = prod * nums[i];
                }
            }
            output[x] = prod;
            x++;
            cont++;
            prod = 1;
        }
        return output;
    }
}  
