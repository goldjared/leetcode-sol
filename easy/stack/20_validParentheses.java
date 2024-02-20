class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        List<Character> list = new ArrayList<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(char c : s.toCharArray()) {
            list.add(c);
            continue;
            }
            if(list.size() == 0) return false;
            if(map.get(c) != list.remove(list.size()-1)) return false;
        }
        return list.size() == 0;
    }
}
