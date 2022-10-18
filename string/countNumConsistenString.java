// Store the frequency of characters of string allowed.
// Check if strings of words is present in the frequency array.
// If all characters found in allowed then count this string too.


class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] ch=new int[26];
        for(int i=0;i<allowed.length();i++){
            ch[allowed.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            int j=0;
            while(j<words[i].length() && ch[words[i].charAt(j)-'a']==1){
                j++;
            }
            if(j==words[i].length())count++;
        }
        return count;
    }
}