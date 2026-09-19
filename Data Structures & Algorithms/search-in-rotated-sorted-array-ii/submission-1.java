class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int flag=0;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                flag++;
            }
        }
        if(flag>0){
            return true;
        }
        else{
            return false;
        }
    }
}