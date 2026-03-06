class FindLucky {
    public int findLucky(int[] arr) {
        int[] freq=new int[501];
        
        for(int num:arr){
            freq[num]++;
        }
        int result=-1;

        for(int i=500;i>=1;i--){
            if(freq[i]==i){
                return i;
            }
        }
        return result;
    }
}
