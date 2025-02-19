class Solution {
    public int search(int[] nums, int target) {

       return searcharr(nums,target,0,nums.length-1);
        
    }

    public int searcharr(int[] nums, int target,int start1,int end1) {


        if(start1 > end1){
            return -1;
        }

        int start=start1;
        int end=end1;
        int mid= (start+end)/2;

        if(nums[mid]==target){
            return mid;
        }
        
        if(nums[start]<= nums[mid]){

            if(nums[start]<=target && target <=nums[mid]){
                return searcharr(nums,target,start,mid-1);
            }else{
                return searcharr(nums,target,mid+1,end);
            }


        }
        else{

             if(nums[mid]<=target && target <=nums[end]){
                return searcharr(nums,target,mid+1,end);
            }else{
                return searcharr(nums,target,start,mid-1);
            }



        }






    }


}