//1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int sum1=0, sum2=0;

        short arrLength = (short)accounts.length;

        for( short i=0; i<arrLength; i++ ) 
        {
            for( short k=0; k<accounts[i].length; k++ ) 
            {
                sum2+=accounts[i][k];

            }  
            if(sum2>sum1)
            {
                sum1=sum2;
            
            }
            sum2=0;


        }
        return sum1;
    }
}