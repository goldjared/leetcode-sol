class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int num:nums) {
            if(set1.contains(num)) return true;
            set1.add(num);
        }

        return false;

    }
}

// had to check solution 
// https://leetcode.com/problems/contains-duplicate/
