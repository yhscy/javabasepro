package cc.yhscy.mapper;

import cc.yhscy.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yhsec on 2023/5/12 15:00
 */
public interface UserMapper {
    List<User> selectAll();
    @Select("select * from tb_user where id = #{id}")
    User selectByIdUser(int id);
    User selectByName(String name);
}
