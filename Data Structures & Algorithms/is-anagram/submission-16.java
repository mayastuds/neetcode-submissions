

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] lettre_num_s = new int[26];
        int[] lettre_num_t = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lettre_num_s[s.charAt(i) - 'a']++;
            lettre_num_t[t.charAt(i) - 'a']++;
        }

        return Arrays.equals(lettre_num_s,   lettre_num_t);
    }
}

