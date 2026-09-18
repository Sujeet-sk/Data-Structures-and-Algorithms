class Pair{
    TreeNode node;
    int level;

    Pair(TreeNode node,int level){
        this.node=node;
        this.level=level;
    }
}
class Solution {
    TreeNode target;
    public void bfs(TreeNode root,HashMap<TreeNode,TreeNode>map,int start){
        if(root==null) return;
        if(root.val==start) target=root;
        if(root.left!=null) map.put(root.left,root);
        if(root.right!=null) map.put(root.right,root);
        bfs(root.left,map,start);
        bfs(root.right,map,start);
    }
    public int amountOfTime(TreeNode root, int start) {
        target=null;
        int min=0;
        HashMap<TreeNode,TreeNode>map=new HashMap<>();
        bfs(root,map,start);
        HashSet<TreeNode>set=new HashSet<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(target,0));
        while(!q.isEmpty()){
            Pair front=q.remove();
            TreeNode node=front.node;
            int level=front.level;
            min=Math.max(min,level);
            set.add(node);
            if(node.left!=null && !set.contains(node.left)) q.add(new Pair(node.left,level+1));
            if(node.right!=null && !set.contains(node.right)) q.add(new Pair(node.right,level+1));
            if(map.containsKey(node) && !set.contains(map.get(node))) q.add(new Pair(map.get(node),level+1));
        }

        return min;
    }
}