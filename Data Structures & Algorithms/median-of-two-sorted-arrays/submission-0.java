class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int [] arr=new int[n+m];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int j=0;j<n;j++){
            arr[j+m]=nums2[j];
        }
        Arrays.sort(arr);
        int total=m+n;
        if(total%2==1){
            return arr[total/2];
        }
        else{
            return (double)(arr[total/2]+arr[(total/2)-1])/2;
        }
    }
}
