package Array;

public class array2 {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};
        int b[] = {2,3};
        int ans[][] = new int[b.length][a.length];
        for(int i = 0 ; i < b.length ; i++){

        }
        rotateByK(a , 2);
        System.out.println();
        printArray(a);
    }

    static void printArray(int a[]){
        for(int e: a){
            System.out.println(e+" ");
        }
    }

    static void rotateByK(int a[] , int k){
        for(int i = 0 ; i < k ; i++){
            int temp = a[0];
            for(int j = 0 ; j < a.length-1 ; j++){
                a[j] = a[j+1];
            }
            a[a.length - 1] = temp;
        }
    }
}
