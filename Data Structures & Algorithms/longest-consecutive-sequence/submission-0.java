class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        
        int num2=0;
        for(int i=0;i<nums.length;i++){
            int num1=nums[i];
            int count=1;
            for(int j=0;j<nums.length;j++){
                if(num1+1==nums[j]){
                    count++;
                    num1=nums[j];
                    j=-1;
                }
            }
            max = Math.max(max, count);
        }
        
        return max;
    }
}
