class Solution {

    public long minimumSteps(String s) {

        long ones = 0;   // counts number of '1's seen so far
        long steps = 0;  // total swaps required

        // Traverse each character in the string
        for (char c : s.toCharArray()) {

            if (c == '1') {
                // Increase count of black balls
                ones++;
            } else {
                // Each previous '1' must cross this '0'
                steps += ones;
            }
        }

        // Return total minimum swaps needed
        return steps;
    }
}
