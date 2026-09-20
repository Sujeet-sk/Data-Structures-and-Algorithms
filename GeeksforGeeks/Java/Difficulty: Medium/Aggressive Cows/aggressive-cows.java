class Solution {
    public int totalCows(int[] arr,int mid){
        int cows=1;
        int prev=arr[0];
        for(int ele:arr){
            if(ele-prev>=mid){
                cows++;
                prev=ele;
            }
        }
        return cows;
    }
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;int max=Integer.MIN_VALUE;
        for(int ele:arr){
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }

        int lo=1, hi=max-min, ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(totalCows(arr,mid)>=k){
                ans=mid;
                lo=mid+1;
            }
            else hi=mid-1;
        }
        return ans;
    }
}