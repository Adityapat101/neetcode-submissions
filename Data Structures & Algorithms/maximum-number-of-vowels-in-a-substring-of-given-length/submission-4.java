class Solution 
{
    public int maxVowels(String s, int k) 
    {   
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int count = 0;

        int l = 0;
        int max = 0;
        int r = 0;

        while(r < s.length())
        {
            int a = r-l+1;

            if(a > k)
            {
                for(char b : vowels)
                {
                    if(b == s.charAt(l))
                    {
                        count--;
                    }
                }

                for(char b : vowels)
                {
                    if(b == s.charAt(r))
                    {
                        count++;
                    }
                }

                l++;
            }
            else
            {
                for(char b : vowels)
                {
                    if(b == s.charAt(r))
                    {
                        count++;
                    }
                }
            }

            max = Math.max(max, count);
            r++;
        }

        return max;
    }
}