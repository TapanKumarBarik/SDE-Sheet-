public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

    }
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        HashSet<Character> map = new HashSet();
        int n = s.length();
        int i = 0;
        int j = 0;
        while (i < n) {
            char curr = s.charAt(i);
            if (!map.contains(curr)) {
                map.add(curr);
                res = Math.max(res, map.size());
                i++;
            } else {
                map.remove(s.charAt(j));
                j++;
            }
        }
        return res;
    }

    // https://www.codingninjas.com/codestudio/problems/630418
    public static int uniqueSubstrings(String input) {
        // write your code here

        int i = 0;
        int j = 0;
        int n = input.length();

        HashSet<Character> set = new HashSet();
        int res = 0;

        while (i < n) {
            char curr = input.charAt(i);
            if (!set.contains(curr)) {

                set.add(curr);
                res = Math.max(res, set.size());
                i++;
            } else {

                set.remove(input.charAt(j));
                j++;
            }
        }

        return res;

    }
}
