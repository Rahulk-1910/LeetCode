class FindLHS {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int maxLen=0;

        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                int len=map.get(key+1)+map.get(key);
                maxLen=Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
}
