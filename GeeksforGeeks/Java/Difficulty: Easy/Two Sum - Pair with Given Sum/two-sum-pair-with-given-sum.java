class Solution {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer>set=new HashSet<>();
        for(int ele:arr){
            int rem=target-ele;
            if(set.contains(rem)) return true;
            else set.add(ele);
        }
        return false;
    }
}