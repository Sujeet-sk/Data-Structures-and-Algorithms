class Solution {
    public void paths(int row,int col,int endRow, int endCol,int[][] maze,boolean[][] visited,String s,ArrayList<String>ans){
        if(row>endRow || col>endCol || row<0 || col<0 || maze[row][col]==0 || visited[row][col]) return;
        visited[row][col]=true;
        if(row==endRow && col==endCol){
            ans.add(s);
            visited[row][col]=false;
            return;
        }
        paths(row,col+1,endRow,endCol,maze,visited,s+"R",ans);
        paths(row,col-1,endRow,endCol,maze,visited,s+"L",ans);
        paths(row-1,col,endRow,endCol,maze,visited,s+"U",ans);
        paths(row+1,col,endRow,endCol,maze,visited,s+"D",ans);
        visited[row][col]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String>ans=new ArrayList<>();
        int n=maze.length;
        boolean[][] visited=new boolean[n][n];
        paths(0,0,n-1,n-1,maze,visited,"",ans);
        Collections.sort(ans);
        return ans;
    }
}