// Intuition
// We have to traverse the tree.

// Base condition:
// if the root is null return the flag value which has stored the boolean value.
// If the set is containing the number equals to k-curr. Modify the flag value as true. Return true.
// Else call the root left child and right child.
// At the end of each node traversal, return the flag value.
// Approach:
// Traverse recursively and store the root value in set.
// x+y=k;
// x=k-y;
// So, we check whether x is present in set or not which is equal to k-y.

// Complexity
// Time complexity: O(n)
// Space complexity: O(n)




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Set<Integer>set=new HashSet<>();
    boolean flag=false;
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return flag;
        if(set.contains(k-root.val)){
            flag=true;
            return flag;
        }
        set.add(root.val);
        findTarget(root.left,k);
        findTarget(root.right,k);
        return flag;
    }
}