class Solution {
    public int numberOfSteps(int num) {
        return helperNumberOfSteps(num, 0);
    }
    static int helperNumberOfSteps(int num, int c){
        if(num == 0){
            return c;
        }
        if(num % 2 == 0){ // even
            return helperNumberOfSteps(num/2, c+1);
        }else{ // odd
            return helperNumberOfSteps(num-1, c + 1);
        }
    }
}