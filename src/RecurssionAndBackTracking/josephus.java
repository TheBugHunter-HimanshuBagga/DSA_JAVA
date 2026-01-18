package RecurssionAndBackTracking;

public class josephus {
    public static void main(String[] args){
        System.out.println(j(5,3));
    }

    static int j(int n , int k){
        if(n == 0) return 0;
        return (j(n - 1 , k) + k ) % n;
    }
}
