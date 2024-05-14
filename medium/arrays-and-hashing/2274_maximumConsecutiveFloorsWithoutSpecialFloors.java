class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);

        int gap = Math.max(special[0] - bottom,
                top - special[special.length - 1]);

        int i = 1;
        while (i < special.length) {
            gap = Math.max((special[i] - special[i - 1]) - 1, gap);
            i++;
        }

        return gap;
    }
}
