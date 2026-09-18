class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String sp = s.replaceAll("[^a-zA-Z0-9]", "");
        int l = 0;
        int r = sp.length()-1;

        while ( l < r)
        {
            if(Character.toLowerCase(sp.charAt(l)) != Character.toLowerCase(sp.charAt(r)))
            {
                return false;
            }
            else
            {
                l++;
                r--;
            }
        }
        return true;
    }
}
