class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> map1 = new HashMap<>(); // for p

        int left =0;
        int right=0;

        while(right < p.length()){
            char ch = p.charAt(right);
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch) + 1);
            }else{
                map1.put(ch, 1);
            }
            right++;
        }

        left = 0;
        right = 0;

        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> map2 = new HashMap<>(); // for s
        while(right < s.length()){
            char ch = s.charAt(right);
            if(map2.containsKey(ch)){
                map2.put(ch , map2.get(ch) + 1);
            }else{
                map2.put(ch, 1);
            }

            if(right - left + 1 == p.length()){ // window size and p length
                if(map2.equals(map1)){
                    result.add(left);
                }

                // shrink
                char removeLeft = s.charAt(left);

                map2.put(removeLeft, map2.get(removeLeft) - 1);

                if(map2.get(removeLeft) == 0){
                    map2.remove(removeLeft);
                }

                left++;
            }

            right++;
        }
        return result;
    }
}