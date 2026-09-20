class Solution {
    public int daysCount(int[] arr,int mid){
        int capacity=mid,days=0;
        for(int ele:arr){
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
        int max=Integer.MIN_VALUE,sum=0;
        for(int ele:weights){
            max=Math.max(max,ele);
            sum+=ele;
        }
        int i=max,j=sum,ans=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            int day=daysCount(weights,mid);
            if(day<=days){
                j=mid-1;
                ans=mid;
            }
            else i=mid+1;
        }
        return ans;
    }
}