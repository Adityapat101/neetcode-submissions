class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++)
        {
            HashSet<Character> set = new HashSet<>();
            count = 0;

            for (int j = i; j < s.length(); j++)
            {
                if (!set.contains(s.charAt(j)))
                {
                    count++;
                    set.add(s.charAt(j));
                    max = Math.max(count, max);
                }
                else
                {
                    break;
                }
            }
        }

        return max;
    }
}
