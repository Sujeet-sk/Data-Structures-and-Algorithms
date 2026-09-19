class Solution {
    public void merge(int[] a,int[] b, int[] nums){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]) nums[k++]=b[j++];
            else nums[k++]=a[i++];
        }
        while(i<a.length) nums[k++]=a[i++];
        while(j<b.length) nums[k++]=b[j++];
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        if(n==1) return nums;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
        int idx=0;
        for(int i=0;i<a.length;i++) a[i]=nums[idx++];
        for(int i=0;i<b.length;i++) b[i]=nums[idx++];
        sortArray(a);
        sortArray(b);
        merge(a,b,nums);

        return nums;
    }
}