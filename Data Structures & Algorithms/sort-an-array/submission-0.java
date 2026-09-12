class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[j]<nums[i]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}