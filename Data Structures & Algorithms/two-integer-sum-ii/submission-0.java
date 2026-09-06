class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length-1;
        int f=0;
        int l=n;
        while(l>f){
            if(numbers[f]+numbers[l]==target){
                return new int[]{f+1,l+1};
            }
            else if(numbers[f]+numbers[l]<target){
                f++;
            }
            else{
                l--;
            }
        }
        return new int[]{};

    }
}
