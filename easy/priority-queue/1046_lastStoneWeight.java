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
