class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&& Math.abs(i-j)<=k){
                    flag++;
                    break;
                }
            }
        }
        if(flag==0){
            return false;
        }
        else{
            return true;
        }
    }
}