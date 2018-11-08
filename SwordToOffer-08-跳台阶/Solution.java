public class Solution {
    public int JumpFloor(int target) {
		int ret=0;
		for(int i=0;i<=target/2;i++) {
			ret+=combination(target-i,i);
		}
		return ret;
    }
	private int combination(int n, int m) {//组合
		//构造杨辉三角 construct yanghui triangle
		int [][] yhtriangle = new int [n+1][n+1];
		for(int i=0;i<=n;i++) {
			yhtriangle[i][0] = 1;
			for(int j=1;j<=i;j++) {
				yhtriangle[i][j] = yhtriangle[i-1][j-1]+yhtriangle[i-1][j];
			}
		}
		return yhtriangle[n][m];
	}
}