package demo.feng;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TestDao {

    @Resource
    private UserMapper userMapper;

//    private TestJpa testJpa;

//    private JdbcTemplate jdbcTemplate;


    public List<User> userquery() {
        List<User> userqu = userMapper.userquery();
        return userqu;
    }

    public void insertuser(User user) {

        userMapper.insertuser(user);
    }


    public void userdelete(int id) {
        userMapper.userdelete(id);
    }


    public void userupdate(User user) {

        userMapper.userupdate(user);

    }

    public User queryid(int id) {

        User user = userMapper.queryid(id);

        return user;


    }


    public void aa() {

//        String sql="insert into class(id,name) values(?,?);";
//        System.out.println(jdbcTemplate.getDataSource());
//
//        jdbcTemplate.update(sql,10,"xingming");

//mabatis

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 200);
        map.put("name", "新增");

//      jpa
//        User user=new User();
//        user.setName("JPauser");


//        userMapper.insertuser("mybatis");
//        userMapper.insertuser(map);
//        testJpa.save(user);


    }


}
