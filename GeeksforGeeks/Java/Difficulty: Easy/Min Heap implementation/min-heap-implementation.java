class minHeap {
    PriorityQueue<Integer>pq;
    public minHeap() {
       pq=new PriorityQueue<>();
    }

    public void push(int x) {
        pq.add(x);
    }

    public void pop() {
        pq.remove();
    }

    public int peek() {
        if(pq.size()!=0) return pq.peek();
        else return -1;
    }

    public int size() {
        return pq.size();
    
    }
}