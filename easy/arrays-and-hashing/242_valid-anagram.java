class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> temp1 = new HashMap();
        HashMap<Character, Integer> temp2 = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            temp1.put(s.charAt(i), 1 + temp1.getOrDefault(s.charAt(i), 0));
            temp2.put(t.charAt(i), 1 + temp2.getOrDefault(t.charAt(i), 0));

        }


        for (Character charc:temp1.keySet()) {

          if(!temp1.get(charc).equals(temp2.getOrDefault(charc, 0))) {
            return false;
          }
        }

        return true;

    }
}
// checked sol
// https://leetcode.com/problems/valid-anagram/

// 05/25/24 revisit
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }
}

// 7/09/24 14min
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0) + 1);
            m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Character c : m1.keySet()) {
            if (!m1.get(c).equals(m2.getOrDefault(c, 0)))
                return false;
        }

        return true;

    }
}




