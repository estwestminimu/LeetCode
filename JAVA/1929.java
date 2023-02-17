//1929. Concatenation of Array


//FIRST
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




//SECOND


class Solution {
    public int[] getConcatenation(int[] nums) {
        
       
       
       

        int k=nums.length;
        nums = Arrays.copyOf(nums, k*2);
        for(int i=0;i<k;i++)
        {
            nums[k+i]=nums[i];

        }

     return nums;

    }
}

//THIRD

class Solution {
    public int[] getConcatenation(int[] nums) {


        short k=(short)nums.length;
        nums = Arrays.copyOf(nums, k*2);
        for(int i=0;i<k;i++)
        {
            nums[k+i]=nums[i];

        }

     return nums;

    }
}


//BEST

class Solution {
    public int[] getConcatenation(int[] nums) {


        short k=(short)nums.length;
        nums = Arrays.copyOf(nums, k*2);  
        System.arraycopy(nums, 0, nums, k, k);

     return nums;

    }
}