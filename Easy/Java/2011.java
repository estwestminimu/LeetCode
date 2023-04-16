//2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        short k=(short)operations.length;
        short sum=0;
        for(short i=0; i<k; i++)
        {
            String w=operations[i]; 
            if(w.startsWith("X+") || w.startsWith("+"))
            {
                sum++;
            }
            else
            {
                sum--;
            }
        }
        return sum;
        
    }
}