class ingleNumber{
    public int singleNumber(int[] nums) {

        int single = 0;   // will store the unique number

        // Traverse all numbers
        for (int val : nums) {
            single ^= val;   // XOR current value with single
        }

        // After loop, duplicates cancel out
        return single;
    }
}