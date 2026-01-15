package RecurssionAndBackTracking;

public class Big0Notations {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int key = 3;
        System.out.println(checkIfNumberIsPresent(a , key));
        printAllPairsInAnArray(a);
    }

    static int getFirstNumber(int a[]){
        return a[0]; // O(1)
    }

    static boolean checkIfNumberIsPresent(int a[] , int key){
        for(int x : a){
            if(x == key) return true; // O(n)
        }
        return false;
    }

    static void printAllPairsInAnArray(int a[]){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++) {
                System.out.println(a[i] + " " + a[j]);
            }
        }
    }

}
