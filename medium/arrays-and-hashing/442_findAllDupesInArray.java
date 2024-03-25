class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] list = new int[nums.length];
        List<Integer> dupes = new ArrayList<>();

        for(int n : nums) {
            if(list[n - 1] > 0) {
                dupes.add(n);
                continue;
            }
            list[n - 1]++;

        }
        return dupes;
    }
}
