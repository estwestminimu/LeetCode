//1512. Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) 
    {
        short sum=0;
        short k=(short)nums.length;
        for(short i=0; i<k; i++)
        {
            for(short j=i; j<k; j++)
            {
                if((nums[i]==nums[j]) && (i<j))
                {
                    sum++;
                }
            

            }
        }
        return sum;
    }
}