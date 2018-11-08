public class Solution {
    public void reOrderArray(int [] array) {
        int oddidx=0;
        int evenidx=0;
        int odd [] =new int [array.length];
        int even[] =new int [array.length];
        for(int i=0;i<array.length;i++){
            if(array[i] %2 ==0){
				even[evenidx++]=array[i];
            }
            else{
                odd[oddidx++]=array[i];
            }
        }
        for(int j=0;j<evenidx;j++){
            odd[oddidx+j]=even[j];
        }
        for(int k=0;k<array.length;k++) {
        	array[k]=odd[k];
        }
    }
}