// attemp 1, 15min
// o(n)
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;

        for (char c : s.toCharArray()) {
            int total = map.getOrDefault(c, 0) + 1;
            map.put(c, total);

            if (total % 2 == 0)
                len += 2;
        }

        return s.length() > len ? len + 1 : len;
    }
}
