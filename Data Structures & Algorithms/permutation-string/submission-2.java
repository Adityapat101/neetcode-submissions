class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        int k = s1.length();

        HashMap<Character, Integer> map1 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++)
        {
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }

        // check if second map equates... 
        
        HashMap<Character, Integer> map2 = new HashMap<>();

        int l = 0;

        int r = 0;

        while (r < s2.length()) 
        {
                map2.put(s2.charAt(r), map2.getOrDefault(s2.charAt(r), 0)+1);
                
                int a = (r-l+1);

                if(a > k)
                {
                    map2.put(s2.charAt(l), map2.get(s2.charAt(l)) - 1);

                    if(map2.get(s2.charAt(l)) == 0)
                    {
                        map2.remove(s2.charAt(l));
                    }

                    l++;

                    a = (r-l+1);


                    if(a == k)
                    {
                        if(map1.equals(map2))
                        {
                            return true;
                        }
                    }
                }

                 if(a == k)
                    {
                        if(map1.equals(map2))
                        {
                            return true;
                        }
                    }
            
                r++;
        }

            return false;
    }   
}
