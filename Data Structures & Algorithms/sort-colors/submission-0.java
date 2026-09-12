class Solution {
    public void sortColors(int[] nums) {
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
        for(int i=0;i<n;i++){
            System.out.println(nums[i]+" ");
        }
        
    }
}