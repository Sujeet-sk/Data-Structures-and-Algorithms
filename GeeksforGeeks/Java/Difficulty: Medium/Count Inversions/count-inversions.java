class Solution {
    public static int mergesort(int[] arr){
        int n=arr.length;
        if(n==1) return 0;
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        int idx=0;
        for(int i=0;i<a.length;i++) a[i]=arr[idx++];
        for(int i=0;i<b.length;i++) b[i]=arr[idx++];
        int count=0;
        count+=mergesort(a);
        count+=mergesort(b);
        count+=merge(arr,a,b);
        return count;
    }
    
    public static int merge(int[] arr,int[] a,int[] b){
        int count=0;
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count+=a.length-i;
                arr[k++]=b[j++];
            }
            else arr[k++]=a[i++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
        return count;
    }
    
    public int inversionCount(int arr[]) {
        return mergesort(arr);
    }
}