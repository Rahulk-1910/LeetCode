class ContainerMaxArea {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=0;

        while(start<end){
            int length=Math.min(height[start],height[end]);
            int width=end - start;
            int area=length*width;

            maxArea=Math.max(area,maxArea);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
}
