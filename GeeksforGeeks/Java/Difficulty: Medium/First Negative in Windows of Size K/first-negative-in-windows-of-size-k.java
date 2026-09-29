class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0) q.add(i);
        }
        for(int i=0;i<n-k+1;i++){
            while(q.size()!=0 && i>q.peek()) q.remove();
            if(q.size()!=0 && i+k-1>=q.peek()) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;
        
    }
}