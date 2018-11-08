public class Solution {
	public static void main(String [] args) {
		char[] chs= {'a'};
		char[] pattern= {'.','*'};
		boolean match=match(chs,pattern);
		System.out.println(match);
	}
    /**
     * 先看边界条件：</br>
     * str为空，pattern不为空的时候不一定</br>
     * str为空，pattern为空时返回true</br>
     * str不为空，pattern不为空时继续</br>
     * str不为空，pattern为空时返回false</br>
     * </br>
     * 考虑在pattern中的当前字符的下个字符为*时，</br>
     * 若pattern当前字符与str当前字符不同，而且pattern当前字符不为‘.’时：pattern向后走2，继续比较，相当于忽略pattern当前字符</br>
     * 若pattern当前字符与str当前字符相同，或者pattern当前字符为‘.’时，pattern需要判断三种情况：1.*匹配0个字符：pattern+2；str不变</br>
     * 2.*匹配1个字符：pattern+2，str+1；3.匹配多个字符：pattern不变，str+1；因此我们需要使用递归来分别对这三种情况进行分析。只要有一种 
     * 情况返回真，则返回真</br>
     * </br>
     * 考虑在pattern中的当前字符的下个字符不为*时，</br>
     * 若pattern当前字符与str当前字符相同，或者pattern当前字符为‘.’，则继续比较下一个</br>
     * 若pattern当前字符与str当前字符不同，而且pattern当前字符不为‘.’，则返回false</br>
     * @param str
     * @param pattern
     * @return
     */
    public static boolean match(char[] str, char[] pattern){
    	if(str == null || pattern == null) return false;
    	return matchcore(str,0,pattern,0);
    }
	private static boolean matchcore(char[] str,int sidx, char[] pattern,int pidx) {
		if(sidx==str.length && pidx>=pattern.length) return true;
		if(sidx != str.length && pidx==pattern.length) return false;
		
		if(sidx<str.length && ((pidx<pattern.length-1 && pattern[pidx+1] != '*') || pidx==pattern.length-1)) {
			if(pattern[pidx] == str[sidx])
				return matchcore(str,sidx+1,pattern,pidx+1);
			else if(pattern[pidx] == '.') 
				return matchcore(str,sidx+1,pattern,pidx+1);
			else return false;
		}
		if(pidx<pattern.length-1 && pattern[pidx+1] == '*') {
			if(sidx<str.length && (pattern[pidx] == str[sidx] || pattern[pidx]=='.'))
				return matchcore(str,sidx,pattern,pidx+2) || matchcore(str,sidx+1,pattern,pidx+2) || matchcore(str,sidx+1,pattern,pidx);
			else {
				return matchcore(str,sidx,pattern,pidx+2);
			}
		}
		return false;
	}
}