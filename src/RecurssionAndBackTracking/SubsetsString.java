package RecurssionAndBackTracking;

public class SubsetsString {
    public static void main(String[] args){
    // abc -> " " , a , b , c , ab , bc , ac , abc = 2^n
        printAllSubsets("abcde");
    }
    static void printAllSubsets(String s){
        printAllSubsetsHelper(s , 0 , "");
    }
    static void printAllSubsetsHelper(String s , int i , String current){
        if(i == s.length()){ // abc -> a
            System.out.println(current);
            return;
        }
        printAllSubsetsHelper(s , i + 1 , current+s.charAt(i)); // add " " + 'a' = "a"
        printAllSubsetsHelper(s , i + 1  , current); // don't add
    }
}
