public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array.length ==0 || array[0].length ==0)
            return false;
        for(int i=array.length-1;i>=0;i--){
            if(target == array[i][0])
                return true;
            else if(target < array[i][0]){
                continue;
            }
            for(int j=0;j<array[0].length;j++){
                if(target == array[i][j])
                    return true;
            }
        }
        return false;
    }
}