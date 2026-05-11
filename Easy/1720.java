//1720. Decode XORed Array


class Solution {
    public int[] decode(int[] encoded, int first) {
        int arr[];
        int length=encoded.length+1;
        arr = new int[length];
        arr[0]=first;
        for(int i=0; i<length-1; i++)
        {
            arr[i+1]=arr[i]^encoded[i];

        }
    
        return arr;
    }
}