class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> h=new HashSet<>();
        
        for(int val:nums1){
            hs.add(val);
        }
        for(int val:nums2){
            if(hs.contains(val)){
                h.add(val);
            }
        }
        int i=0;
        int[] result=new int[h.size()];
        for(int val:h){
            result[i++]=val;
        }
        return result;
    }
}
