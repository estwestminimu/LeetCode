class Solution {
    public int[] twoSum(int[] nums, int target) {
 Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
       int output[] = new int[2];
         int z;
        for(int i=0; i<nums.length; i++)
        {
            //wartosc
           z=target-nums[i];
            //sprawdzamy czy taka wartosc istnieje
            if(numbers.get(z)!=null)
            {
                output[0]=i;
                output[1]=numbers.get(z);//wyswietlamy pozycje
                break;
            }
                     else
            {
                numbers.put(nums[i], i);
            }
        } 
        return output; 
    }}

        
        
        