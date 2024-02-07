// attempt 1, has issue of more than one word having same ASCII value, even though they aren't anagrams. 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer, List<String>> asciiVals = new HashMap();
        for(String word : strs) {
            int asciiVal = 0;
            for(int i = 0; i < word.length(); i++) {
                asciiVal += (int) word.charAt(i);
            }
            if(!asciiVals.containsKey(asciiVal)) {
                asciiVals.put(asciiVal, new ArrayList<>(Arrays.asList(word)));
                anagrams.put(sortedString, new ArrayList<>(Arrays.asList(word));
            } else {
                asciiVals.get(asciiVal).add(word);
            }
            
        }
        // List<List<String>> anagrams = new ArrayList<>(asciiVals.values());
        // return anagrams;
        return new ArrayList<>(asciiVals.values());

    }
}

// attempt 2, checked solution. this method does not use ASCII values at all, 
// instead the idea is to sort each string, and the sorted string become a key in the hashmap. 
// by this method, it fixes the error I had before of more than one value (non-anagram) having the same ASCII tot
// al. 
// then, if the hashmap does not contain the sortedStr, it add it as key, and creates a list as value, with the Arrays.asList to add the current word to said list.
// if the hashmap already contains the sortedword, it will add the word to correct list value.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> anagrams = new HashMap();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if (!anagrams.containsKey(sortedString)) {
                anagrams.put(sortedString, new ArrayList<>(Arrays.asList(word)));
            } else {
                anagrams.get(sortedString).add(word);
            }
        }
        return new ArrayList<>(anagrams.values());

    }
}
// https://leetcode.com/problems/group-anagrams
