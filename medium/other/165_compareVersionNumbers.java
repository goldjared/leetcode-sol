class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split(\.);
        String[] v2 = version2.split(\.);
        int v1Len = v1.length;
        int v2Len = v2.length;

        for (int i = 0; i < Math.max(v1Len, v2Len); i++) {
            int v1Temp = v1Len - 1 < i ? 0 : Integer.parseInt(v1[i]);
            int v2Temp = v2Len - 1 < i ? 0 : Integer.parseInt(v2[i]);
            if (v1Temp != v2Temp) {
                return v1Temp < v2Temp ? -1 : 1;
            }

        }

        return 0;

    }
}
