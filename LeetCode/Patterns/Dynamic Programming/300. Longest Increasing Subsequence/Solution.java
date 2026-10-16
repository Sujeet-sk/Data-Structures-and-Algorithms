class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            int max=1;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    int sum=1+dp[j];
                    max=Math.max(max,sum);
                }
            }
            dp[i]=max;
        }
        int max=0;
        for(int ele:dp){
            max=Math.max(max,ele);
        }
        return max;
    }
}