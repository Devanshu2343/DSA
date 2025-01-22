class Solution {
    public int thirdMax(int[] nums) {
        Long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        
        for (int num : nums) {
            if (num == first || num == second || num == third) {
                continue;
            }
            
            if (num > first) {
                third = second;
                second = first;
                first = (long) num;
            } else if (num > second) {
                third = second;
                second = (long) num;
            } else if (num > third) {
                third = (long) num;
            }
        }
        
        return third == Long.MIN_VALUE ? first.intValue() : third.intValue();
    }
}
