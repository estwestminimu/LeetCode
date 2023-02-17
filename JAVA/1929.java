//1929. Concatenation of Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] myArra;
        int k=nums.length;
        myArra = new int[k*2];

        int z=0;
        for(int i=0;i<k;i++)
        {
            myArra[z]=nums[i];
            myArra[k+z]=nums[i];
            z++;
        }

     return myArra;

    }
}