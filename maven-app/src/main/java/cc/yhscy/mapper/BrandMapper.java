package cc.yhscy.mapper;

import cc.yhscy.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by yhsec on 2023/5/14 12:42
 */
public interface BrandMapper {
    List<Brand> selectAll();
    Brand selectByIdBrand(int id);
    /*
    多条件查询三种方式：
    1.param
    2.整个对象
    3.Map
     */
//    List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);
//    List<Brand> selectByCondition(@Param("status")int status, @Param("companyName")String companyName, @Param("brandName")String brandName);


    List<Brand>selectByCondtionSingle(Brand brand);

    void add(Brand brand);

    void delByIds(@Param("ids") int[] ids);

}
