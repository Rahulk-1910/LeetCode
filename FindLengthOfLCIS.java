class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        int count=1;
        int longest=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
                longest=Math.max(count,longest);
            }else{
                count=1;
            }
        }
        return longest;
    }
}
