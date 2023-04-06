package demo.feng;


//import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

//    @Insert("insert into class(name) values(#{name})")
//    public void insertuser(String name);
//    public void insertuser(Map<String,Object> map);

    @Insert("insert into class(name,addr,age) values(#{name},#{addr},#{age})")
    public void insertuser(User user);

    @Select("select * from class")
    public List<User> userquery();

    @Delete("delete from class where id =#{id}")
    public void userdelete(int id);

    @Select("select * from class where id=#{id}")
    public User queryid(int id);

    @Update("update class set name=#{name},addr=#{addr},age=#{age} where id=#{id}")
    public void userupdate(User user);


}
