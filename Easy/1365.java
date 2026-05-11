//1365. How Many Numbers Are Smaller Than the Current Number


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        short k=(short)nums.length;

        int[] arr;
        arr= new int[k];

    for(short i=0;i<k; i++)
    {
        short sum=0;
        for(short w=0;w<k;w++)
        {
            if(nums[w]<nums[i])
            {
                sum++;
            }

        }

        arr[i]=sum;
    }


    return arr;
    }
}



//Second

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int k=nums.length;

        int[] arr=nums.clone();
        Arrays.sort(arr);

    for(int i=0;i<k; i++)
        {
 
        for(int w=0;w<k;w++)
        {
            if(arr[w]==nums[i])
            {
                nums[i]=w;
                break;
            }

        }

       
    }



    return nums;
    }
}