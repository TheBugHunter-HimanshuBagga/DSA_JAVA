// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         // since my output is in form of [0,6] hence
//         List<Integer> result = new ArrayList<>();
//         HashMap<Character,Integer> pMap = new HashMap<>(); // for p
//         char[] arr2 = p.toCharArray();
//         if(p.length() > s.length()){
//             return result;
//         } 
//         // if not like this 
//         for(char ch2: arr2){
//             if(pMap.containsKey(ch2)){
//                 pMap.put(ch2 , pMap.get(ch2) + 1);
//             }else{
//                 pMap.put(ch2,1);
//             }
//         }
//         /*
//         a->1
//         b->1
//         c->1
//         */
//         for(int i=0;i<=s.length()-p.length();i++){
//             HashMap<Character,Integer> sMap = new HashMap<>();
//             for(int j=i;j<i+p.length();j++){
//                 char ch = s.charAt(j);
//                 if(sMap.containsKey(ch)){
//                     sMap.put(ch,sMap.get(ch)+1);
//                 }else{
//                     sMap.put(ch,1);
//                 }
//             }
//             if(sMap.equals(pMap)){
//                 result.add(i);
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        // Sliding Window
        List<Integer> result = new ArrayList<>();

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> pMap = new HashMap<>();

        if (p.length() > s.length()) {
            return result;
        }

        // Frequency map of p
        for (char ch1 : p.toCharArray()) {
            if (pMap.containsKey(ch1)) {
                pMap.put(ch1, pMap.get(ch1) + 1);
            } else {
                pMap.put(ch1, 1);
            }
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            // Acquire
            char ch2 = s.charAt(right);

            if (sMap.containsKey(ch2)) {
                sMap.put(ch2, sMap.get(ch2) + 1);
            } else {
                sMap.put(ch2, 1);
            }

            // Window size becomes equal to p.length()
            if (right - left + 1 == p.length()) {

                if (sMap.equals(pMap)) {
                    result.add(left);
                }

                // Remove left character
                char leftChar = s.charAt(left);

                sMap.put(leftChar, sMap.get(leftChar) - 1);

                if (sMap.get(leftChar) == 0) {
                    sMap.remove(leftChar);
                }

                left++;
            }
        }

        return result;
    }
}