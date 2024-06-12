// 06/12/24 25 min, o(n), n space, can be done without aux array
class Solution {
    public void sortColors(int[] nums) {
        int min = 0;
        int max = nums.length - 1;

        int[] nums2 = new int[nums.length];

        for(int n : nums) {
            if(n == 0) nums2[min++] = 0;
            if(n == 2) nums2[max--] = 2;
        }

        for(int i = 0; i < nums.length; i++) {
            if(i >= min && i <= max) nums[i] = 1;
            else nums[i] = nums2[i];
        }
        
    }
}
