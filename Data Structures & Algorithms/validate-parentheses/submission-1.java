class Solution 
{
    public boolean isValid(String s) 
    {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (c == '[' || c == '{' || c == '(')
            {
                stack.push(c);
            }
            else if (stack.isEmpty())
            {
                return false;
            }
            else if (c == ')' && stack.peek() != '(')
            {
                return false;
            }
            else if (c == '}' && stack.peek() != '{')
            {
                return false;
            }
            else if (c == ']' && stack.peek() != '[')
            {
                return false;
            }
            else
            {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}