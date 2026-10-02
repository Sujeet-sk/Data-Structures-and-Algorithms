class Solution {
    public int reverse(int n) {
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
        return rev;
    }
}