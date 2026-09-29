class Solution {
    public static int moves(int n,int src,int aux,int des,int count){
        if(n==0) return count;
        count=moves(n-1,src,des,aux,count);
        count++;
        count=moves(n-1,aux,src,des,count);
        return count;
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
        return moves(n,from,aux,to,0);
    }
}
