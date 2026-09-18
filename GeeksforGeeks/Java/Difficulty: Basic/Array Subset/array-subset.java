
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:a){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        
        for(int i=0;i<b.length;i++){
            if(!map.containsKey(b[i])) return false;
            if(map.get(b[i]) == 1) map.remove(b[i]);
            else map.put(b[i],map.get(b[i])-1);
        }
        
        return true;
    }
}
