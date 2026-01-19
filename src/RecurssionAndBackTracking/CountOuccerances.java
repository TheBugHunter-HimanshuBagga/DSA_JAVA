package RecurssionAndBackTracking;
// ababbabac -> aba


public class CountOuccerances {
    public static void main(String[] args){
        String s = "abaabaaba";
        String t = "aba";
        System.out.println(count(t , s));
    }

    static int count(String t , String s){
        return countHelper(t , s , 0);
    }

    static int countHelper(String t , String s , int i){
        if(i > s.length() - t.length()){
            return 0;
        }
        int subProblemAnswer = countHelper(t, s , i + 1);// unless it hits this if case -> ac -> 0
        boolean doStartingCharMatch = s.substring(i , i + t.length()).equals(t); // bac -> not equals aba
        if(doStartingCharMatch) return subProblemAnswer + 1;
        else return subProblemAnswer;
    }
}
