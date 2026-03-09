class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list=new ArrayList<>();

        while(left<=right){
            int num=left;
            boolean valid = true;
            while(num>0){
                int d= num%10;
                if(d==0 || left%d!=0){
                    valid=false;
                    break;
                }
                num/=10;

            }
            if(valid){
                list.add(left);
            }
            left++;
        }
        return list;
    }
}
