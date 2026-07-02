class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // true / false
        // Brute force
        HashMap<Character,Integer> s1Map = new HashMap<>();

        if(s1.length() > s2.length()){
            return false;
        }

        for(char ch1: s1.toCharArray()){
            if(s1Map.containsKey(ch1)){
                s1Map.put(ch1 , s1Map.get(ch1)+1);
            }else{
                s1Map.put(ch1 , 1);
            }
        }
        /*
            after this my s1 will have
            s1 = "ab", s2 = "eidbaooo"
            a->1
            b->1
        */

        for(int i=0;i<=s2.length()-s1.length();i++){
            HashMap<Character,Integer> s2Map = new HashMap<>();
            for(int j = i ; j < i + s1.length(); j++){
                char ch2 = s2.charAt(j);
                if(s2Map.containsKey(ch2)){
                    s2Map.put(ch2,s2Map.get(ch2)+1);
                }else{
                    s2Map.put(ch2,1);
                }
            }
            /*
            s2 will now also be the 
            ei
            ed
            db
            ba
            ao
            oo
            */


            //ERROR coming - if the s2Map has the same char as s1 with the same number of ouccerences inside the both hence we will be returning true hence
            if(s2Map.equals(s1Map)){
                return true;
            }
        }
        return false;
    }
}