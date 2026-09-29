class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        
        for(int i=0;i<mat1.length;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<mat2.length;j++){
                int sum=0;
                for(int k=0;k<mat1[0].length;k++){
                    sum+=mat1[i][k]*mat2[k][j];
                }
                ans.get(i).add(sum);
            }
        }
        return ans;
    }
}