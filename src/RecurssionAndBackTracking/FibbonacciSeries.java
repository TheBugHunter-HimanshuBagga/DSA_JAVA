package RecurssionAndBackTracking;
// 0 1 1 2 3 5 8 13 21 34 .....
public class FibbonacciSeries {
    public static void main(String[] args){
        System.out.println(fibbo(5));
    }

    static int fibbo(int n){
        if(n==0 || n==1) return n;
        return fibbo(n-1) + fibbo(n - 2);
    }
}
