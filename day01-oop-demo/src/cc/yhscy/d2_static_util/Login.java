package cc.yhscy.d2_static_util;

/**
 * @author ShiChun
 * @date 2022/12/21 9:25
 */
public class Login {
    public static void main(String[] args) {
//        String code = "";
//        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//
//        Random rm = new Random();
//        for (int i = 0; i <5 ; i++) {
//            int index = rm.nextInt(data.length());
//            code += data.charAt(index);
//
//        }
//        System.out.println(code);

        String code = YhscyUtil.generateCode(5);
        System.out.println(code);

    }

}
