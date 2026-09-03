class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int num:nums){
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->seen.get(a)-seen.get(b));
        for(int num: seen.keySet()){
            pq.add(num);
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
