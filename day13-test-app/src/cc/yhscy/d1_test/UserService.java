package cc.yhscy.d1_test;

/**
 * Created by yhsec on 2023/2/4 11:36
 */
public class UserService {
    public String LoginName(String account,String passWord){
        if ("admin".equals(account) && "1234560".equals(passWord)){
            return "登录成功";
        }else {
            return "登录失败";
        }
    }

    public void selectName(){
        System.out.println(10/0);
        System.out.println("查询成功");
    }
}
