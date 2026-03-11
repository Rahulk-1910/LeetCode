class SortColors {
    public void sortColors(int[] nums) {
        int[] arr=new int[3];

        for(int v:nums){
            arr[v]++;
        }
        int index=0;
        for(int i=1;i<=arr[0];i++){
            nums[index++]=0;
        }
        for(int i=1;i<=arr[1];i++){
            nums[index++]=1;
        }
        for(int i=1;i<=arr[2];i++){
            nums[index++]=2;
        }
    }
}
