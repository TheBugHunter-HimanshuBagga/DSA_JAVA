class Solution {
    public int totalFruit(int[] fruits) {
        int p1 = 0;
        int p2 = 0;
        int mazL = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>(); // stores the key value key-> integer, value -> integer

        while(p2 < n){
            // put inside the map
            map.put(fruits[p2], map.getOrDefault(fruits[p2], 0) + 1); // key, value

            if(map.size() > 2){ // since in each basket we can keep 1 hence maxSize is 2
                // remove
                map.put(fruits[p1], map.getOrDefault(fruits[p1] , 0) - 1);

                if(map.get(fruits[p1]) == 0){ // removing condition
                    map.remove(fruits[p1]);
                }
                p1++;
            }

            mazL = Math.max(mazL, p2 - p1 + 1); 
            p2++;
        }
        return mazL;
    }
}