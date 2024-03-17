class Solution {
    public int[] twoSum(int[] n, int t) {
        int l = 0;
        int r = n.length-1;
        while(l<r) {
            if((n[r] + n[l]) > t) {
                r--;
            } else if((n[r] + n[l]) < t) {
                l++;
            } else {
                break;
            }
        }

        return new int[] {++l, ++r};
    }
}
