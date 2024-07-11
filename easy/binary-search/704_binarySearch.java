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

// 7/10/24 18:36

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {

                r = mid - 1;
            }
        }
        return -1;

    }
}
