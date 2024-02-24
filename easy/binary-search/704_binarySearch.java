class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        if(l==r && nums[0]==target) return 0;
        while(l<=r) {
            int m = (int) Math.floor((l+r)/2);
            if(nums[m] == target) return m;
            if(nums[m] > target) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return -1;
    }
}
