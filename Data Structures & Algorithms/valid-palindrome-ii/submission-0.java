class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(right)!=s.charAt(left)){
                return check(s,left+1,right)||check(s,left,right-1);
            }
            right--;
            left++;
        }
        return true;


    }
    public boolean check(String str,int left,int right){
        while(left<right){
            if(str.charAt(right)!=str.charAt(left)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}