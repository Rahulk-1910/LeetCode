class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxsofar=-1;

        for(int i=n-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=maxsofar;
            maxsofar=Math.max(maxsofar,temp);
        }
        return arr;
    }
}
