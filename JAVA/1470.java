//1470. Shuffle the Array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] array;
        array = new int[2*n];
        for(short i=0, z=0; i<n; i++, z++)
        {

            array[z]=nums[i];
            z++;
            array[z]=nums[i+n];
        }
        return array;
    }
}