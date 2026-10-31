class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}

class Solution {
    public void bfs(int i,int j,char[][] grid,boolean[][] visited){
        int m=grid.length,n=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        visited[i][j]=true;
        while(!q.isEmpty()){
            Pair front=q.remove();
            int row=front.i;
            int col=front.j;
            
            //right
            if(col+1<n){
                if(grid[row][col+1]=='1' && !visited[row][col+1]){
                    q.add(new Pair(row,col+1));
                    visited[row][col+1]=true;
                }
            }
            //down
            if(row+1<m){
                if(grid[row+1][col]=='1' && !visited[row+1][col]){
                    q.add(new Pair(row+1,col));
                    visited[row+1][col]=true;
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length,n=grid[0].length;
        int count=0;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    bfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
}