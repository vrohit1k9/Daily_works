class Solution {
    public int maxArea(int[] heights) {
        int res=0;
        int area;
        int r=heights.length-1;
        int l=0;
        while(l<r){
            area=(r-l)*(Math.min(heights[l],heights[r]));
            res=Math.max(res,area);
            if(heights[r]<heights[l]){
                r--;
            }
            else{
                l++;
            }
        }
        return res;
    }
}
