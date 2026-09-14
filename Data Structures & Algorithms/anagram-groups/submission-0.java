class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
       // List<List<String>> list = new ArrayList<>();

        HashMap<HashMap<Character, Integer>, List<String>> groups = new HashMap<>();

        for (int i = 0; i < strs.length; i++)
        {
            StringBuilder sb = new StringBuilder(strs[i]);

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < sb.length(); j++)
            {
                Character a = sb.charAt(j);
                map.put(a, map.getOrDefault(a, 0) + 1);
            }

            ArrayList<String> temp = new ArrayList<>();
            temp.add(strs[i]);

            if(!(groups.containsKey(map)))
            {

                groups.put(map, temp);
            }
            else
            {
                groups.get(map).add(strs[i]);
            }
        }

        return new ArrayList<>(groups.values());
    }
}