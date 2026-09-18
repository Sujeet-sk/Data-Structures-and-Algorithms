class Solution {
    public int countDistinct(int arr[]) {
        HashSet<Integer>set=new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        int size=set.size();
        return size;
    }
}