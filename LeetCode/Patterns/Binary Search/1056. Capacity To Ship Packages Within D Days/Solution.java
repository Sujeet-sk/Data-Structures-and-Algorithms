class Solution {
    public int days(int[] weights,int mid){
        int capacity=mid,days=0;
        for(int ele:weights){
            if(capacity>=ele){
                capacity=capacity-ele;
            }
            else{
                days++;
                capacity=mid-ele;
            }
        }
        days++;
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE; int sum=0;
        for(int ele:weights){
            sum+=ele;
            max=Math.max(max,ele);
        }
        int lo=max, hi=sum, ans=sum;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(days(weights,mid)<=days){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
}