class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int max=0;
        for(int n:seen){
            if(!seen.contains(n-1)){
                int current=n;
                int count=1;
                while(seen.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(count,max);

            }
            

        }
        return max;
    }
}
