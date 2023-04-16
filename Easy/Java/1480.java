//1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        
        short k=(short)nums.length;

        int[] arr;
        arr = new int[k];
        int sum=0;
        for(short i=0; i<k; i++)
        {

                sum+=nums[i];
                arr[i]+=sum;
        }
        return arr;
    }
}