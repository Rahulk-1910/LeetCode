class Solution {
    public int majorityElement(int[] nums) {
        int current=0;
        int count=0;
        for(int n:nums){
            if(count==0){
                current=n;
            }

            if(n==current) count++;
            else count--;

            
        }
        return current;
    }
}
