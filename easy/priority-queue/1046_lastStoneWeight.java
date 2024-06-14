class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones) {
            PQ.add(s);
        }

        while(PQ.size() > 1) {
            int x = PQ.poll();
            int y = PQ.poll();
            int smash = x - y;
            if(smash > 0) PQ.add(smash);
        }
        
        return PQ.size() > 0 ? PQ.poll() : 0;
        
    }
}

// 06/14/24 15min 
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones) pQ.add(n);
        while(pQ.size() > 1) {
            int x = pQ.poll();
            int y = pQ.poll();
            if(x != y) pQ.add(x - y);
        }

        return pQ.size() > 0 ? pQ.peek() : 0;
        
    }
}
