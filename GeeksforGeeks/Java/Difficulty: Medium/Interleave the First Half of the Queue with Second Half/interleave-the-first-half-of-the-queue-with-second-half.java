class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        int n=q.size();
        int half=n/2;
        Queue<Integer>q2=new LinkedList<>();
        for(int i=1;i<=half;i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
}
