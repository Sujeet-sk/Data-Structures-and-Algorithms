class Solution {
    public int ways(int target,int i,int[] nums,int[][] dp,int sum){
        if(target > sum || target < -sum) return 0;
        if(i==nums.length){
            if(target==0) return 1;
            else return 0;
        }
        if(dp[i][target+sum]!=-1) return dp[i][target+sum];
        int pick=ways(target-nums[i],i+1,nums,dp,sum);
        int skip=ways(target+nums[i],i+1,nums,dp,sum);
        return dp[i][target+sum]=pick+skip;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int ele:nums) sum+=ele;
        int[][] dp=new int[nums.length][2*sum+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return ways(target,0,nums,dp,sum);
    }
}