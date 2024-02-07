//attemp 1, passed. not very efficient

class Solution {
    public boolean isPalindrome(String s) {
        String temp = "";
        char[] charArr = s.toCharArray();
        for(char c : charArr) {
            if(Character.isLetterOrDigit(c)) temp += c;
        }
        char[] cleanedCharArr = temp.toLowerCase().toCharArray();
        int j = 0;
        int k = cleanedCharArr.length - 1;
        int max = (int) Math.ceil(k + 1);

        for(int i = 0; i < max; i++) {
            if(cleanedCharArr[j] != cleanedCharArr[k]) return false;
            j++;
            k--;
        }
        return true;
    }
}
