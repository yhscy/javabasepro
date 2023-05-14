package cc.yhscy;

import cc.yhscy.mapper.BrandMapper;
import cc.yhscy.mapper.UserMapper;
import cc.yhscy.pojo.Brand;
import cc.yhscy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yhsec on 2023/5/14 13:42
 */
public class mybatistest {
    @Test
    public void testSelectAll() throws IOException {
//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//4. 执行方法
        List<Brand> brands = brandMapper.selectAll();
        System.out.println(brands);
//5. 释放资源
        sqlSession.close();



}
    @Test
    public void testSelectByID() throws IOException {
        int id = 3;
//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//4. 执行方法
        Brand brands = brandMapper.selectByIdBrand(id);
        System.out.println(brands);
//5. 释放资源
        sqlSession.close();



    }

    @Test
    public void testSelectByCondition() throws IOException {
//        方式一：
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        处理参数：
        companyName = "%" + companyName +"%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);

//        方式三：
        Map map = new HashMap();
        map.put("status",status);
        map.put("companyName",companyName);
//        map.put("brandName",brandName);


//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//4. 执行方法
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);//方式一
//        List<Brand> brands = brandMapper.selectByCondition(brand);//方式二
        List<Brand> brands = brandMapper.selectByCondition(map);//方式三

        System.out.println(brands);
//5. 释放资源
        sqlSession.close();



    }

    @Test
    public void testSelectByConditionSingle() throws IOException {
//        方式一：
        int status = 1;
        String companyName = "华为";
        String brandName = "华为";
//        处理参数：
        companyName = "%" + companyName +"%";
        brandName = "%" + brandName + "%";

        Brand brand = new Brand();
//        brand.setStatus(status);
        brand.setBrandName(brandName);
//        brand.setCompanyName(companyName);

//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//4. 执行方法
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);//方式一
//        List<Brand> brands = brandMapper.selectByCondition(brand);//方式二
        List<Brand> brands = brandMapper.selectByCondtionSingle(brand);//方式三

        System.out.println(brands);
//5. 释放资源
        sqlSession.close();



    }

    @Test
    public void testadd() throws IOException {
//        方式一：
        int status = 1;
        String companyName = "一维大成";
        String brandName = "天波";
        Integer ordered = 1111;
        String description = "好好的发展";



        Brand brand = new Brand();
        brand.setStatus(status);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setDescription(description);
        brand.setOrdered(ordered);

//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//4. 执行方法
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);//方式一
//        List<Brand> brands = brandMapper.selectByCondition(brand);//方式二
        brandMapper.add(brand);//方式三
        System.out.println(brand.getId());

//5. 释放资源
        sqlSession.close();



    }


    @Test
    public void deleteByIds() throws IOException {
//        方式一：
         int[] ids = {8,9};

//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//3. 获取Mapper接口的代理对象
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//4. 执行方法
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);//方式一
//        List<Brand> brands = brandMapper.selectByCondition(brand);//方式二
        brandMapper.delByIds(ids);//方式三


//5. 释放资源
        sqlSession.close();



    }

    @Test
    public void testInput(){
        System.out.println("你好");

    }


    @Test
    public void testSelectById() throws IOException {
        int id = 1;
//1. 获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//2. 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
//3. 获取Mapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//4. 执行方法
//        List<Brand> brands = brandMapper.selectByCondition(status,companyName,brandName);//方式一
//        List<Brand> brands = brandMapper.selectByCondition(brand);//方式二
         User user = userMapper.selectByIdUser(id);//方式三
        System.out.println(user);


//5. 释放资源
        sqlSession.close();



    }

}
