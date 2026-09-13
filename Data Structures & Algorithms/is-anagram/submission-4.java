class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character, Integer> forS = new HashMap<>();

        HashMap<Character, Integer> forT = new HashMap<>();

        StringBuilder fS = new StringBuilder(s);
        StringBuilder fT = new StringBuilder(t);

        for (int i = 0; i < fS.length(); i++)
        {
            char a = fS.charAt(i);
            forS.put(a, forS.getOrDefault(a, 0) + 1 );
        }

        for (int i = 0; i < fT.length(); i++)
        {
            char b = fT.charAt(i);
            forT.put(b, forT.getOrDefault(b, 0) + 1 );
        }

        return (forS.equals(forT));
    }
}