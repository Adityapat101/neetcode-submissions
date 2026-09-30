
class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<Character> set = new HashSet<>();

        for (int bR = 0; bR < 9; bR+=3)
        {
            for (int bC = 0; bC < 9; bC+=3)
            {

                set.clear();
                
                for (int i = bR; i < bR+3; i++)
                {
                    for (int j = bC; j < bC+3; j++)
                    {
                        if(board[i][j] != '.')
                        {
                            if(set.contains(board[i][j]))
                            {
                                return false;
                            }
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        

        // rows
        HashSet<Character> row = new HashSet<>();

        for (int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[i].length; j++)
            {
                if(board[i][j] != '.')
                {
                    if(row.contains(board[i][j]))
                    {
                        return false;
                    }
                    row.add(board[i][j]);
                }
            }
            row.clear();
        }

        //cols
        HashSet<Character> col = new HashSet<>();

        for (int c = 0; c < board[0].length; c++)
        {
            for(int r = 0; r < board.length; r++)
            {
                if(board[r][c] != '.')
                {
                    if(col.contains(board[r][c]))
                    {
                        return false;
                    }
                    col.add(board[r][c]);
                }
            }
            col.clear();
        }

        return true;
    }
}