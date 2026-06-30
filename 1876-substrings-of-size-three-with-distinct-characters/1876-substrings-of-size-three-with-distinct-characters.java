class Solution {
    public int countGoodSubstrings(String s) {
        // brute force
        int count = 0;
        for(int i =0 ; i <= s.length()-3;i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            char third = s.charAt(i+2);
            if(first != second && first != third && second != third){
                count++;
            }
        }
        return count;
    }
}