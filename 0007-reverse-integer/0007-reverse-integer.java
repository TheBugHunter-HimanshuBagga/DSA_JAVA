class Solution {
    public int reverse(int x) {
        int ans = 0;
        return helperReverse(x,ans);
    }
    static int helperReverse(int x, int ans){
        
        if(x == 0){
            return ans;
        }
        int lastDigit = x%10; // 123 -> 3

        if(ans > Integer.MAX_VALUE / 10 || 
            (ans == Integer.MAX_VALUE / 10 && lastDigit > 7)){ //2147483647
            return 0;
        }

        if (ans < Integer.MIN_VALUE / 10 || 
            (ans == Integer.MIN_VALUE / 10 && lastDigit < -8)) {//-2147483648
            return 0;
        }

        ans = ans * 10 + lastDigit;
        int remainingDigits = x/10;
        return helperReverse(remainingDigits, ans);
    }
}
