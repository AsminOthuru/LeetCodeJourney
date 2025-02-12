class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] result=new int[nums1.length+nums2.length];
        int num1=0;
        int num2=0;
        int i=0;
        int mid=0;
        if(nums1.length==0){
            if(nums2.length%2==0){
                mid=(nums2.length)/2;
                return (double)(nums2[mid] + nums2[mid - 1]) / 2;


            }else{
                mid=(nums2.length)/2;
                return (double)nums2[mid];

            }
        }
        if(nums2.length==0){
            if(nums1.length%2==0){
                mid=(nums1.length)/2;
                return (double)(nums1[mid] + nums1[mid - 1]) / 2;

                
            }else{
                mid=(nums1.length-1)/2;
                return (double)nums1[mid];
            }

        }
        while(!(num1==nums1.length) && !(num2==nums2.length) ){
            if(nums1[num1]>nums2[num2]){
                result[i]=nums2[num2];
                i++;
                num2++;

            }else{
                result[i]=nums1[num1];
                i++;
                num1++;

            }
        }
        while(!(num1==nums1.length)){
            result[i]=nums1[num1];
            i++;
            num1++;

        }
        while(!(num2==nums2.length)){
            result[i]=nums2[num2];
            i++;
            num2++;
            
        }
        if(result.length%2==0){
                mid=(result.length)/2;
                return (double)(result[mid] + result[mid - 1]) / 2;


        }
        else{
                mid=(result.length)/2;
                return (double)result[mid];

            }



       
               
    }

}