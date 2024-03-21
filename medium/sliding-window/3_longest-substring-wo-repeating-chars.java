class Solution {
  public int lengthOfLongestSubstring(String s) {
    Set<Character> repeat = new HashSet<>();
    int max = 0;
    int l = 0;

    for (char c : s.toCharArray()) {
      while (repeat.contains(c)) {
        repeat.remove(s.charAt(l));
        l++;
      }
      repeat.add(c);
      if (max < repeat.size())
        max = repeat.size();
    }
    return max;

  }
}
