package SortingAndGreedyAlgorithm;

// use to sort array
// after every iteration largest number comes to end
public class bubbleSort {
    public static void main(String[] args) {
        int a[] = {9,5,3,1,2};

        bubbleSort(a);
        for(int x : a){
            System.out.println(" " + x);
        }
    }

    static void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0 ; i < n-1 ; i++){ // number of iterations [5,3,4,1,2] -> [3,4,1,2,5] i = 0
            for(int j = 0 ; j < n - i - 1 ; j++){//
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
