class Solution {
    public int characterReplacement(String s, int k) {
        int p1 = 0;
        int p2 = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxL = 0;
        while(p2 < s.length()){
            char ch = s.charAt(p2);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
            maxFreq = Math.max(maxFreq, map.get(ch));
            while(((p2 - p1 + 1) - maxFreq )> k){
                // shrink
                char left = s.charAt(p1);
                map.put(left , map.get(left) - 1);
                p1++;
            }

            maxL = Math.max(maxL, p2 - p1 + 1);

            p2++;
        }
        return maxL;
    }
}