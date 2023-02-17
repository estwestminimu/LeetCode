//1920. Build Array from Permutation
class Solution {
    public int[] buildArray(int[] nums) {
        

        short k = (short)nums.length;
        int[] arr;
        arr= new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i]=nums[nums[i]];

        }

     return arr;

    }
    }