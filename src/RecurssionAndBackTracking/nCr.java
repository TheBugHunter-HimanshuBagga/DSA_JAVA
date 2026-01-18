package RecurssionAndBackTracking;

public class nCr {
    public static void main(String[] args){
        System.out.println(NCR(5,3));
    }

    static int NCR(int n , int r){
        if(n == r || r == 0) return 1;
        return NCR(n-1 , r-1) + NCR(n-1 , r);
    }
}
