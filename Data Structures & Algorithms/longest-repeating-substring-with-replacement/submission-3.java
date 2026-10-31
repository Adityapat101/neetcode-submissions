class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int r = 0;

        while (r < s.length())
        {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            int maxFreq = 0;

            for (int freq : map.values())
            {
                maxFreq = Math.max(maxFreq, freq);
            }

            int a = (r-l+1) - maxFreq;

            while (a > k)
            {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;

                maxFreq = 0;
                for (int freq : map.values())
                {
                    maxFreq = Math.max(maxFreq, freq);
                }

                a = (r-l+1) - maxFreq;
            }

            max = Math.max(r-l+1, max);
            r++;
        }

        return max;
    }
}