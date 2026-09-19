class maxHeap {
    PriorityQueue<Integer>pq;
    public maxHeap() {
        pq=new PriorityQueue<>(Collections.reverseOrder());
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