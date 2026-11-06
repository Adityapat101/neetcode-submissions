class Solution 
{
    public String addSpaces(String s, int[] spaces) 
    {
        int l = 0;

        int r;

        StringBuilder m = new StringBuilder();

        for(int i = 0; i < spaces.length; i++)
        {
            r = spaces[i];

            while(l <= r)
            {
                if(l == r)
                {
                    m.append(" ");
                }

                m.append(s.charAt(l));
                l++;
            }

        }
        
        int b = s.length() + spaces.length;

        if(m.length() != b)
        {
            while(l < s.length())
            {
                m.append(s.charAt(l));
                l++;
            }
        }

        return m.toString();
            
    }
}
