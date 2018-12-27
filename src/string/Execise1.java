package string;

/**
 * @program: Algorithm
 * @description: 替换空格 把字符串的空格替换为“%20”
 * @author: Wsl
 * @create: 2018-12-27 13:56
 **/
public class Execise1 {
    //思路1：遍历替换，后移，O(n2)

    public static String replace(String string){
        char[] chars = string.toCharArray();
        for (int x = 0;x<chars.length;x++){
            if (" ".equals(chars[x])){
                for (int y = chars.length-1;y>x;y--){
                        chars[y+3]=chars[y];
                }
            }
        }

        return new String(chars);
    }


}
