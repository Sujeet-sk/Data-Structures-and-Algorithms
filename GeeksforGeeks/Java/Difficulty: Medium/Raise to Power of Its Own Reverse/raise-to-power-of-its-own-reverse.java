class Solution {
    public int reverse(int n,int r){
        if(r==0) return 1;
        int call=reverse(n,r/2);
        if(r%2==0) return call*call;
        else return n*call*call;
    }
    public int reverseExponentiation(int n) {
        if(n==10) return n;
        return reverse(n,n);
    }
}
