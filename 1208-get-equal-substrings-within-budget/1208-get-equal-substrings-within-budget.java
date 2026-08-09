class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int p1 = 0;
        int p2 = 0;
        int cost = 0;
        int maxL = 0;
        while(p2 < s.length()){
            cost += Math.abs(s.charAt(p2) - t.charAt(p2));

            while(cost > maxCost){ // shrink window 
                cost -= Math.abs(s.charAt(p1) - t.charAt(p1));
                p1++;
            }

            maxL = Math.max(maxL, p2-p1+1);
            p2++;
        }
        return maxL;
    }
}