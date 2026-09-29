class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer>st=new Stack<>();

           //NSE
        int[] nse=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            if(st.size()==0) nse[i]=arr.length;
            else if(arr[i]>arr[st.peek()]) nse[i]=st.peek();
            else{
                while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
                if(st.size()!=0) nse[i]=st.peek();
                else nse[i]=arr.length;
            }
            st.push(i);
        }

        st.clear();

           //PSE
        int[] pse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        if(st.size()==0) pse[i]=-1;
        else if(arr[i]>arr[st.peek()]) pse[i]=st.peek();
        else{
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()!=0) pse[i]=st.peek();
            else pse[i]=-1;
            }
            st.push(i);
        }

        int max_area=0;
        for(int i=0;i<arr.length;i++){
            int width=nse[i]-pse[i]-1;
            int area=arr[i]*width;
            max_area=Math.max(max_area,area);

        }

        return max_area;
    }

    public int maxArea(int matrix[][]) {
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1) matrix[i][j]=matrix[i-1][j] + matrix[i][j];
            }
        }

        int max_area=0;
        for(int i=0;i<matrix.length;i++){
            int area=largestRectangleArea(matrix[i]);
            max_area=Math.max(max_area,area);
        }

        return max_area;
    }
}