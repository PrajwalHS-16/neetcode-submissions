class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int i:nums){
            seen.put(i,seen.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->seen.get(a)-seen.get(b));
        for(int n:seen.keySet()){
             pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
           
        }

        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        return arr;
        
    }
}
