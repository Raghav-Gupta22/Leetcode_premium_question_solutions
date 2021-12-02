import java.util.*;
public class Solution {
    public int MinimumCost(List<Integer> sticks) {
        int x,y,ans=0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(sticks);
         while (minHeap.size()>1)
         {
            x=minHeap.poll();
            y=minHeap.poll();
            ans+=x+y;
            minHeap.add(x+y);
         }
         return ans;
    }
}
