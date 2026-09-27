class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {

      for (int i = 0; i < matrix.length; i++)
      {
        for (int r = 0; r < matrix[i].length; r++)
        {
            if(target == matrix[i][r])
            {
                return true;
            }
        }
      }

      return false;
    }
}
