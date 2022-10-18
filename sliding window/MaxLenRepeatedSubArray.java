class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        //left shift nums2
		//right shift nums2
        int n1=nums1.length;
        int n2=nums2.length;
        int max=0;
        for(int i=0;i<n1;i++){
            int k=0;
            int count=0;
            for(int j=i;j<n1 ;j++){
                if(k<n2 && nums1[j]==nums2[k++]){
                    count++;
                    max=Math.max(max,count);
                }else count=0;
            }
        }
        for(int i=0;i<n2;i++){
            int k=0;
            int count=0;
            for(int j=i;j<n2;j++){
                if(k<n1 && nums2[j]==nums1[k++]){
                    count++;
                    max=Math.max(max,count);
                }else count=0;
            }
        }
        return max;
    }
}