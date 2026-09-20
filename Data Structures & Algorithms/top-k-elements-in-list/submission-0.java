class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] ans = new int[k];

        for (int n : nums)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }

       PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a)); 

        for (int n : map.keySet())
        {
            p.add(n);
        }

        for (int i = 0; i < k; i++)
        {
            ans[i] = p.poll();
        }

         return ans;
    }
}
