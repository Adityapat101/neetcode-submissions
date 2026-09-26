class Solution
{
    public int maxArea(int[] heights) 
    {
       int l = 0;
       int r = heights.length-1;
       int width = 0;

       int area = 0;

       int max = 0;

        while (l < r)
        {
            width = r - l;

            area = width * (int)(Math.min(heights[l], heights[r]));

            if(area > max)
            {
                max = area;
            }
            if(heights[l] < heights[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }

        return max;
    }
}
