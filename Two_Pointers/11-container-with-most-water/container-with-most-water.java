class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area=0;

        while(i<j) {
            int width = j-i;
            int curr_height = Math.min(height[i], height[j]);
            int curr_area= width*curr_height;
            area = Math.max(curr_area , area);
            
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return area;
    }
}