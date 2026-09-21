class Solution {
    public void solution(int row,char[][] chessBoard,List<List<String>>ans){
        int n=chessBoard.length;
        if(row==n){
            List<String>placed=new ArrayList<>();
            for(int i=0;i<n;i++) placed.add(new String(chessBoard[i]));
            ans.add(placed);
            return;
        }
        for(int col=0;col<n;col++){
            if(isPlaced(row,col,chessBoard)){
                chessBoard[row][col]='Q';  //Mark
                solution(row+1,chessBoard,ans);   //move to next row
                chessBoard[row][col]='.';       //unmark
            }
        }
    }
    public boolean isPlaced(int row,int col,char[][] chessBoard){
        int n=chessBoard.length;
        //check column
        int i=row-1;
        while(i>=0){
            if(chessBoard[i][col]=='Q') return false;
            i--;
        }

        //check left-diagonal
        i=row-1;
        int j=col-1;
        while(i>=0 && j>=0){
            if(chessBoard[i][j]=='Q') return false;
            i--;
            j--;
        }

        //check right-diagonal
        i=row-1;
        j=col+1;
        while(i>=0 && j<n){
            if(chessBoard[i][j]=='Q') return false;
            i--;
            j++;
        }
        return true;
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][] chessBoard=new char[n][n];
        for(char[] ele:chessBoard) Arrays.fill(ele,'.');
        solution(0,chessBoard,ans);
        return ans;
    }
}