class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n=nums.length;

        //LIS
        int[] dp1=new int[n];
        dp1[0]=1;
        for(int i=1;i<n;i++){
            int len=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int sum=1+dp1[j];
                    len=Math.max(len,sum);
                }
            }
            dp1[i]=len;
        }

        //LDS
        int[] dp2=new int[n];
        dp2[n-1]=1;
        for(int i=n-2;i>=0;i--){
            int len=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int sum=1+dp2[j];
                    len=Math.max(len,sum);
                }
            }
            dp2[i]=len;
        }

        int max_sum=0;
        for(int i=0;i<n;i++){
            if(dp1[i]>1 && dp2[i]>1){
                int sum=dp1[i]+dp2[i]-1;
                max_sum=Math.max(max_sum,sum);
            }
        }

        if(max_sum<3) return 0;
        return n-max_sum;
    }
}