class Solution {
    public void totalPer(int[] nums,boolean[] check,List<Integer>arr,List<List<Integer>>ans){
        if(arr.size()==nums.length){
            List<Integer>copy=new ArrayList<>(arr);
            ans.add(copy);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                arr.add(nums[i]);
                check[i]=true;
                totalPer(nums,check,arr,ans);
                arr.remove(arr.size()-1);
                check[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        boolean[] check=new boolean[nums.length];
        totalPer(nums,check,arr,ans);
        return ans;
    }
}