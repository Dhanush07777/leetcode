class Solution {
    public int searchInsert(int[] nums, int target) {

          int start = 0;
        int end = nums.length-1;
        
        for(int i =0; i< nums.length; i++){
            if(target == nums[i]){
                return i;
            }
            else{

           while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }
            }
        }
         return start;
        
    }
}