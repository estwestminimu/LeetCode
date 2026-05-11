//509. Fibonacci Number

class Solution {
    public int fib(int n) {
        double a=Math.sqrt(5);
        double b=Math.pow((1+a)/2,n);
        double c=Math.pow((1-a)/2,n);
        return (int)((1/a)*(b-c));
    }
}