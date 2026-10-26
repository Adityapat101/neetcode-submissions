/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution 
{
    public boolean canAttendMeetings(List<Interval> intervals) 
    {
        intervals.sort((a, b) -> Integer.compare(a.end, b.end));



        if (intervals.size() <= 1)
        {
            return true;
        }

        int c = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++)
        {
            if(intervals.get(i).start < c)
            {
                return false;
            }
            else
            {
                c = intervals.get(i).end;
            }
        }

        return true;

    }
}
