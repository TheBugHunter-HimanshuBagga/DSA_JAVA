package SortingAndGreedyAlgorithm;

public class MajorityElement {
    public static void main(String[] args){
        int a[] = {3,3,4,2,4,4,2,4,4}; //4
        System.out.println(majorityElement(a));
    }
    // moore's voting algorithm
    static int majorityElement(int a[]){
        int count = 1;
        int majority = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] == majority){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                majority = a[i];
                count = 1;
            }
        }
        int frequency = 0;
        for(int e: a){
            if(e == majority) frequency++;
        }
        return frequency > a.length/2 ? majority : -1;
    }
}
