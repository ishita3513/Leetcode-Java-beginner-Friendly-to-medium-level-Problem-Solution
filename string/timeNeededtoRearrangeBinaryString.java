class Solution {
    public int secondsToRemoveOccurrences(String s) {
        int n=s.length();
        if(n==1)return 0;
        int count=Integer.MAX_VALUE;
        int res=0;
        StringBuilder str=new StringBuilder(s);
        while(count>0){
            count=0;
            for(int i=0;i<n-1;i++){
                if(str.charAt(i)=='0' && str.charAt(i+1)=='1')count++;
            }
            if(count==0)return res;
            for(int i=0;i<n-1;i++){
                if(str.charAt(i)=='0' && str.charAt(i+1)=='1'){
                    str.setCharAt(i,'1');
                    str.setCharAt(i+1,'0');
                    i++;
                }
            }
            res++;
        }
        return res;
    }
}