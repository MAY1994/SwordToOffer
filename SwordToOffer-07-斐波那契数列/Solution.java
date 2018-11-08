public class Solution {
    public int Fibonacci(int n) {
        int al [] = new int [40];
        al[0]=0;
        al[1]=1;
        for(int i=2;i<=n;i++){
            al[i] = al[i-1]+al[i-2];
        }
        return al[n];
    }
}