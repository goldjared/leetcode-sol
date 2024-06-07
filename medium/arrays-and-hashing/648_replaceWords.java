// 06/07/24
// 32 min, o(n*m)

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        /*
        string sol

        map, roots

        sentence to arr split on space
        for each char in sentence arr[i], check if map contains
        from char[0] to char[i]
            if true, replace char[i] with the match
        */
        HashSet<String> set = new HashSet<>();
        for(String s : dictionary) {
            set.add(s);
        }

        String[] sentences = sentence.split(" ");

        for(int i = 0; i < sentences.length; i++) {
            String temp = "";
            for(char c : sentences[i].toCharArray()) {
                temp = temp + c;
                if(set.contains(temp)) {
                sentences[i] = temp;
                break;
                }
            }
        }

        return String.join(" ", sentences);
        
    }
}
