package leetCode.test;

import java.util.HashMap;
import java.util.Stack;

public class isValidTest {
    public static void main(String[] args) {

    }
    //判断字符串中的括号是否都能成功匹配
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        char[] chars = s.toCharArray();
        int index = 0;
        Stack<Character> chs = new Stack<>();
        while (index < chars.length) {
           if (chars[index] == '(' || chars[index] == '[' || chars[index] == '{'){
               chs.push(chars[index]);
               index++;
               continue;
           }else {
                if (chs.empty()){
                    return false;
                }else{
                    if (chs.peek().equals( map.get(chars[index]))){
                        chs.pop();
                        index ++;
                    }else{
                        return false;
                    }
                }
           }

        }

        return chs.empty() ;
    }


}
