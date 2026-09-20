class Solution {
    public long hours(int[] piles,int mid){
        long k=0;
        for(int ele:piles){
            if(ele%mid==0) k+=ele/mid;   
            else k+=(ele/mid)+1;
        }
        return k;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int ele:piles) max=Math.max(max,ele);
        int i=1,j=max,ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            long speed=hours(piles,mid);
            if(speed<=h){
                j=mid-1;
                ans=mid;
            }
            else i=mid+1;
        }
        return ans;
    }
}