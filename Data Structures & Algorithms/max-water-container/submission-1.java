class Solution {
    public int maxArea(int[] heights) {
        int maxArea=0;
        int first=0;
        int last=heights.length-1;
        int area=0;
        while(last>first){
            area=Math.min(heights[first],heights[last])*(last-first);
            if(heights[first] > heights[last]){
                last--;
            }
            else{
                first++;
            }
            
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
}
