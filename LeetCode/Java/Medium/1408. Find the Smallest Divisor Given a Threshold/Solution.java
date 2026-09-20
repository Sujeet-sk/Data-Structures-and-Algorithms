class Solution {
    public int divisor(int[] nums,int mid){
        int div=0;
        for(int ele:nums){
            if(ele%mid==0) div+=ele/mid;
            else div+=ele/mid+1;
        }
        return div;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int ele:nums) max=Math.max(max,ele);
        int lo=1, hi=max, ans=max;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(divisor(nums,mid)<=threshold){
                ans=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return ans;
    }
}

    