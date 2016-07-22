package dataStructure;

public class ReverseString {
	
    public String reverseString(String s) {
        char[] sc = s.toCharArray();
        
        int len = sc.length;
//        System.out.println(sc);
        char[] toReturn = new char[len];//char 数组初始化
        
        for(int i = 0; i<len; i++){
            toReturn[len-1-i] = sc[i];
        }
        String toReturnString = new String(toReturn);
        System.out.println(toReturnString);
        return toReturnString;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		String ans = rs.reverseString("abcde");
		System.out.println(ans);
	}

}
