class Solution {
    public boolean isPerfect(int n){
        int sqrt=(int)(Math.sqrt(n));
        if()
        return sqrt*sqrt==n;
    }
    public int numSquares(int n) {
        if(isPerfect(n)) return 1;
        int least=n;
        for(int i=1;i<=n/2;i++){
            int count=numSquares(i)+numSquares(n-i);
            least=Math.min(least,count);
        }
        return least;
    }
}