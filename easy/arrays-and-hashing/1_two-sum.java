class Solution {
    public int[] twoSum(int[] nums, int target) {
        //key value, val index
        HashMap<Integer, Integer> possibleVals = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i<nums.length; i++) {
            if(possibleVals.containsKey(target-nums[i])) {
              ans[0] = possibleVals.get(target-nums[i]);
              ans[1] = i;
              return ans;
            }
            possibleVals.put(nums[i], i);
          }
        return ans;
    }
}
// checked sol
// https://leetcode.com/problems/two-sum/
