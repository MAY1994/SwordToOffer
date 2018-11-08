import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1])
                return array[i];
        }
        return 0;
    }
}