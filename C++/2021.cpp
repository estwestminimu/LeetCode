//2011. Final Value of Variable After Performing Operations
class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        short k=operations.size();
        short sum=0;
        for(short i=0; i<k; i++)
        {
            string w=operations[i]; 
            if(w=="X++" || w=="++X")
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
};