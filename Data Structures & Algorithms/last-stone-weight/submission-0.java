class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

       for(int s:stones){
        maxHeap.add(s);
       }

       while(maxHeap.size()>1){
        int f = maxHeap.poll();
        int sec = maxHeap.poll();
        if(sec!=f){
            maxHeap.add(f-sec);
        }
       }
       

       return maxHeap.size()==1? maxHeap.peek():0;

    }
}
