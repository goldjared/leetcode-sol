class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            if (nums[l] >= 0 || nums[r] < 0)
                return -1;

            int absL = Math.abs(nums[l]);
            if (absL == nums[r])
                return nums[r];
            if (nums[r] > absL) {
                r--;
            } else {
                l++;
            }

        }

        return -1;

    }
}
