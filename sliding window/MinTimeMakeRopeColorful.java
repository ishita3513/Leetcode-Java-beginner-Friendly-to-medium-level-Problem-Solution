// Intuition
// As we know, we have to remove all consecutive numbers in neededtime, having same color.
// That directly means we are just keeping the high cost values in the array.
// So, get the high cost elements and add to a var sum.
// At the end just return the difference of total sum of array and the high cost values sum.

// Approach
// Two pointer approach

// Complexity
// Time complexity: O(n)
// Space complexity: O(1) constant space(no extra memory taken to store anything)


class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length(), fptr=0,sptr=0,max=0,sum=0;
        //while same traverse and then collect the max cost,for every group cover the maximum one 
        //because the maimum only going to stay
        while(sptr<n){
            if(colors.charAt(fptr)==colors.charAt(sptr)){
                max=Math.max(max,neededTime[sptr]);
                sptr++;
            }
            else if(colors.charAt(fptr)!=colors.charAt(sptr)){
                sum+=max;
                max=0;
                fptr=sptr;
            }
        }
        sum+=max;
        int total=0;
        for(int i=0;i<n;i++){
            total+=neededTime[i];
        }
        return total-sum;
    }
}