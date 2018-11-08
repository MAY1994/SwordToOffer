public class Solution {
	public static void main(String [] args) {
		char[] chs= {'a'};
		char[] pattern= {'.','*'};
		boolean match=match(chs,pattern);
		System.out.println(match);
	}
    /**
     * �ȿ��߽�������</br>
     * strΪ�գ�pattern��Ϊ�յ�ʱ��һ��</br>
     * strΪ�գ�patternΪ��ʱ����true</br>
     * str��Ϊ�գ�pattern��Ϊ��ʱ����</br>
     * str��Ϊ�գ�patternΪ��ʱ����false</br>
     * </br>
     * ������pattern�еĵ�ǰ�ַ����¸��ַ�Ϊ*ʱ��</br>
     * ��pattern��ǰ�ַ���str��ǰ�ַ���ͬ������pattern��ǰ�ַ���Ϊ��.��ʱ��pattern�����2�������Ƚϣ��൱�ں���pattern��ǰ�ַ�</br>
     * ��pattern��ǰ�ַ���str��ǰ�ַ���ͬ������pattern��ǰ�ַ�Ϊ��.��ʱ��pattern��Ҫ�ж����������1.*ƥ��0���ַ���pattern+2��str����</br>
     * 2.*ƥ��1���ַ���pattern+2��str+1��3.ƥ�����ַ���pattern���䣬str+1�����������Ҫʹ�õݹ����ֱ��������������з�����ֻҪ��һ�� 
     * ��������棬�򷵻���</br>
     * </br>
     * ������pattern�еĵ�ǰ�ַ����¸��ַ���Ϊ*ʱ��</br>
     * ��pattern��ǰ�ַ���str��ǰ�ַ���ͬ������pattern��ǰ�ַ�Ϊ��.����������Ƚ���һ��</br>
     * ��pattern��ǰ�ַ���str��ǰ�ַ���ͬ������pattern��ǰ�ַ���Ϊ��.�����򷵻�false</br>
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