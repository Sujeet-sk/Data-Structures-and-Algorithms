class Solution {
    public int hours(int[] piles,int mid){
        int k=0;
        for(int ele:piles){
            if(mid>=ele) k++;
            else k+=(ele/mid)+1;
        }
        return k;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int ele:piles) max=Math.max(max,ele);
        int lo=1, hi=max, speed=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(hours(piles,mid)<=h){
                speed=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return speed;
    }
}