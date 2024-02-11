// attempt 1, passed. not very efficient

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

// attempt 2
class Solution {
    public boolean isPalindrome(String s) {
        char[] chArr = s.toCharArray();
        int j = 0;
        int k = chArr.length - 1;
        for(char c: chArr) {
            if(k<0 || j>=k) return true;
            while(!Character.isLetterOrDigit(chArr[j])) {
                if(j>=k) return true;
                j++;
            }
            while(!Character.isLetterOrDigit(chArr[k])) {
                if(k<=0) return true;
                k--;
            }
            if(Character.toLowerCase(chArr[j]) != Character.toLowerCase(chArr[k])) return false;
            j++;
            k--;
        }
        return true;
    }
}
