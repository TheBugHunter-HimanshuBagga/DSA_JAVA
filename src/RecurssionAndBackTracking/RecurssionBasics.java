package RecurssionAndBackTracking;

public class RecurssionBasics {
    public static void main(String[] args){
        bar(5);
    }

    static void fun(int n){
        if(n > 0) { // base condition
            System.out.println(n);
            fun(n - 1);
        }
    }

    static void foo(int n){
        if(n > 0) { // base condition
            foo(n - 1);
            System.out.println(n);
        }
    }

    static void bar(int n){
        if(n > 0){
            System.out.println(n);
            bar(n - 1);
            bar(n - 1);
        }
    }
}
