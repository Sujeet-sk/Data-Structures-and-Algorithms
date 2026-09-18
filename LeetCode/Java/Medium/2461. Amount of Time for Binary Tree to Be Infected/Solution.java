/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        TreeNode target=null;
        HashMap<TreeNode,TreeNode>parent=new HashMap<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){                    //first BFS
            TreeNode node=q.poll();
            if(node.val==start) target=node;
            if(node.left!=null){
                parent.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null){
                parent.put(node.right,node);
                q.add(node.right);
            }
        }

        int min=0;
        HashSet<TreeNode>visited=new HashSet<>();                
        q.add(target);                                         //second bfs
        visited.add(target);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                TreeNode par=parent.get(node);
                if(node.left!=null && !visited.contains(node.left)){
                    visited.add(node.left);
                    q.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    visited.add(node.right);
                    q.add(node.right);
                }
                if(par!=null && !visited.contains(par)){
                    visited.add(par);
                    q.add(par);
                }
            }
            if(!q.isEmpty()) min++;
        }
        return min;
    }
}