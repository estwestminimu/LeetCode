//771. Jewels and Stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        short sum=0;
     
        //short k=(short)stones.length();


        for(short i=0 ;i<stones.length();i++)
        {

            sum+=jewels.indexOf(stones.charAt(i))==-1 ? 0 : 1; 

        }


       return sum; 
    }
}