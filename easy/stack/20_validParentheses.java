class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        List<Character> list = new ArrayList<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        for(char c : s.toCharArray()) {
            if(!map.containsKey(c)) {
            list.add(c);
            continue;
            }
            if(list.size() == 0) return false;
            if(map.get(c) != list.remove(list.size()-1)) return false;
        }
        return list.size() == 0;
    }
}

// 07/09/24 23min
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (char c : s.toCharArray()) {
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty())
                    return false;
                if (stack.pop() != map.get(c))
                    return false;
            } else {
                stack.push(c);
            }

        }
        return stack.empty();

    }
}
