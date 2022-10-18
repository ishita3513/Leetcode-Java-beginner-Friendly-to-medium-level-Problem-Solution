class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        int left=0,right=n-1,up=0,down=n-1;
        // for(int i=0;i<n;i++){
        while(left<=right && up<=down){
            int[] upcopy=new int[right-left+1];
            int k=0;
            for(int j=left;j<=right;j++){
                upcopy[k++]=mat[up][j];
            }
            int[] rightcopy=new int[down-up+1];
            k=0;
            for(int j=up;j<=down;j++){
                rightcopy[k++]=mat[j][right];
            }
            int[] downcopy=new int[right-left+1];
            k=0;
            for(int j=right;j>=left;j--){
                downcopy[k++]=mat[down][j];
            }
            int[] leftcopy=new int[down-up+1];
            k=0;
            for(int j=down;j>=up;j--){
                leftcopy[k++]=mat[j][left];
            }
            
            k=0;
            for(int j=left;j<=right;j++){
                mat[up][j]=leftcopy[k++];
            }
            k=0;
            for(int j=up;j<=down;j++){
                mat[j][right]=upcopy[k++];
            }
            k=0;
            for(int j=right;j>=left;j--){
                mat[down][j]=rightcopy[k++];
            }
            k=0;
            for(int j=down;j>=up;j--){
                mat[j][left]=downcopy[k++];
            }
            left++;
            right--;
            up++;
            down--;
            
        }
    }
}