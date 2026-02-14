class Solution {
    public int missingNumber(int[] nums) {
        
      int i=0;
      Arrays.sort(nums);
      while(i<=nums.length){
        if(i==nums.length) return i;
        if(i!=nums[i]) return i;
        i++;
      }
      return -1; 
    }
}
