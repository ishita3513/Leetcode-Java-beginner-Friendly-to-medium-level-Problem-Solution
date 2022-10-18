class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int n=blocks.length();
        int minW=n;
        for(int i=0;i<=n-k;i++){
            int temp=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W')temp++;
            }
            minW=Math.min(temp,minW);
        }
        return minW;
    }
}