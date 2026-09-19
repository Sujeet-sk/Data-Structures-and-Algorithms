class Solution {
    public void quickSort(int[] nums,int low,int high){
        if(low<high){
            int pivot_idx=partition(nums,low,high);
            quickSort(nums,low,pivot_idx-1);
            quickSort(nums,pivot_idx+1,high);
        }

    }
    public int partition(int[] nums,int low,int high){
        int pivot=nums[high];
        int idx=low;
        for(int i=low;i<high;i++){
            if(nums[i]<pivot){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx++]=temp;
            }
        }
        int temp=nums[idx];
        nums[idx]=nums[high];
        nums[high]=temp; 

        return idx;
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        quickSort(nums,0,n-1);
        return nums;
    }
}