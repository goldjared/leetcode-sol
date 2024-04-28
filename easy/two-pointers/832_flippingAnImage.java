class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] intArr : image) {
            int l = 0;
            int r = intArr.length - 1;
            while (l <= r) {
                int copy = intArr[l];
                intArr[l] = intArr[r] == 1 ? 0 : 1;
                intArr[r] = copy == 1 ? 0 : 1;
                l++;
                r--;

            }
        }

        return image;
    }
}
