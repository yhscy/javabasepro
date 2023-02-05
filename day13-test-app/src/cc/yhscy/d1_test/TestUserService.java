package cc.yhscy.d1_test;

import org.junit.*;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by yhsec on 2023/2/4 11:40
 */
public class TestUserService {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("@BefortClass修饰静态方法，在类加载前执行一次");
    }

    @AfterClass
    public static void AfertClass(){
        System.out.println("@AfterClass修饰静态方法，在类加载前执行一次");
    }

    @Before
    public void before(){
        System.out.println("@Before修饰实例方法，在每个方法前执行一次");
    }

    @After
    public void after(){
        System.out.println("@After修饰实例方法，在每个方法执行后一次");
    }

    @Test
    public void testLoginName(){
        UserService us = new UserService();
        String rs = us.LoginName("admin","1234560");
        //断言
        Assert.assertEquals("登录接口出现异常","登录成功",rs);

    }

    @Test
    public void testSeletctName(){
        UserService us = new UserService();
        us.selectName();
    }

}
