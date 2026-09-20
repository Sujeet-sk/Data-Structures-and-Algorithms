class Solution {
    public int sumDivision(int[] nums,int mid){
        int total=0;
        for(int ele:nums){
            if(ele%mid==0) total+=ele/mid;
            else total+=(ele/mid)+1;
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max=Integer.MIN_VALUE;
        for(int ele:nums) max=Math.max(max,ele);
        int i=1,j=max,ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int sum=sumDivision(nums,mid);
            if(sum<=threshold){
                j=mid-1;
                ans=mid;
            }
            else i=mid+1;
        }
        return ans;
    }
}

    