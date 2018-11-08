import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
	       int row=matrix.length;
	       int col=matrix[0].length;
	       ArrayList<Integer> al= new ArrayList<Integer>();
	       int start=0;
	       for(int i=start,j=start;i<row&&j<col;i++,j++,col--,row--,start++) {
	    	   for(;j<col;j++) 
	    		   al.add(matrix[i][j]);
	    	   for(j--;i+1<row;i++)
	    		   al.add(matrix[i+1][j]);
	    	   for(;j-1>=start&&i>start;j--)
	    		   al.add(matrix[i][j-1]);
	    	   for(;i-1>start&&j<col-1;i--)
	    		   al.add(matrix[i-1][j]);
	    	   i--;
	       }
	       return al;
	}
}