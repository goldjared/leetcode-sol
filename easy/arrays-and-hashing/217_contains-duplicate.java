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

// 03/31/24 5min no sol check
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) return true;
            set.add(n);
        }

        return false;
    }
}
// 07/07/24 3min
// same sol
