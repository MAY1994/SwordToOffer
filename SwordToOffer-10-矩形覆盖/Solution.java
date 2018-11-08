public class Solution {
    public int RectCover(int target) {
        if(target==0){
            return 0;
        }
        int store[] = new int [1000];
        store[0]=1;
        store[1]=2;
        for(int i=2;i<target;i++){
            store[i]=store[i-1]+store[i-2];
        }
        return store[target-1];
    }
}