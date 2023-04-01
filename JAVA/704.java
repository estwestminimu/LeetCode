//704. Binary Search
class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end= nums.length-1;


        while(start<end)
        {
           int pivot=start+(end-start+1)/2;
            if(nums[pivot]>target)
            {
                end=pivot-1;
                
            }
            else
            {
                start=pivot;

            }

        }
        if(nums[start]==target)
        {
            return start;
        }
        else
        {
            return -1;
        }
    }
}