public class Solution {
    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
    	return string.replaceAll(" ","%20");
    }
}