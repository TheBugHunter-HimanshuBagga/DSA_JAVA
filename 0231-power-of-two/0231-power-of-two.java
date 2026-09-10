class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 != 0){ // odd
            return false;
        }
        return helper(n) == 1;
    }
    public int helper(int n ){
        if(n == 1){
            return 1;
        }
        if(n % 2 != 0){
            return 0;
        }
        int remaining = n/2;
        return helper(remaining);
    }
}