class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=1;
        int max=1;
        for(int i=1;i<n;i++){
            int len=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int sum=1+dp[j];
                    len=Math.max(len,sum);
                }
            }
            dp[i]=len;
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}