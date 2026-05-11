//35. Search Insert Position

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
         int mid=0;
        while(start<end)
        {
            mid=start+(end-start)/2;
             
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]>target)
            {
                end=mid;
            }
            else
            {
                 start=mid+1;
            }

        }


        return nums[start]<target?start+1:start;

    }
}