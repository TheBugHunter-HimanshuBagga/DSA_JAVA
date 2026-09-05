class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

        HashMap<String, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int len = minSize; len <= maxSize; len++) {

                if (i + len > s.length()) {
                    break;
                }

                HashMap<Character, Integer> freq = new HashMap<>();

                for (int j = i; j < i + len; j++) {

                    char ch = s.charAt(j);

                    if (freq.containsKey(ch)) {
                        freq.put(ch, freq.get(ch) + 1);
                    } else {
                        freq.put(ch, 1);
                    }
                }

                if (freq.size() <= maxLetters) {

                    String sub = s.substring(i, i + len);

                    if (map.containsKey(sub)) {
                        map.put(sub, map.get(sub) + 1);
                    } else {
                        map.put(sub, 1);
                    }

                    ans = Math.max(ans, map.get(sub));
                }
            }
        }

        return ans;
    }
}