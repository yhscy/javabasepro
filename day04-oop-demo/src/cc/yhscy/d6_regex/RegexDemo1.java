package cc.yhscy.d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yhsec on 2023/1/7 15:45
 */
public class RegexDemo1 {
    public static void main(String[] args) {
        /*
        正则表达式支持爬取信息
         */

        String rs = "来黑马程序学习Java,电话020-43422424，或者联系邮箱,itcast@itcast.cn,电话18762832633，0203232323 ,邮箱bozai@itcast.cn，400-100-3233 ，4001003232";

        String regex = "(\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2})|" + "(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|400-?\\d{3,8}-?\\d{3,8}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(rs);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
