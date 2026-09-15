class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> seen=new HashMap<>();
        int res=0,currsum=0;
        seen.put(0,1);
        for(int n:nums){
            currsum+=n;
            int diff = currsum - k;
            if(seen.containsKey(diff)){
                res+=seen.get(diff);
            }
            seen.put(currsum,seen.getOrDefault(currsum,0)
            +1);
        }
        return res;
        

    }
}