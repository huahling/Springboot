//package demo.shujuyuan.Test1.dao;
//
//import demo.shujuyuan.Test1.entity.User;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.cache.annotation.Cacheable;
//
//
//@CacheConfig(cacheNames = "baseCache")//缓存
//public interface UserMapper1 {
//
//    @Insert("insert into class values(null,#{name},#{addr},#{age});")
//    public int useradd1(@Param("name") String name,@Param("addr") String addr,@Param("age") int age);
//
//    @Cacheable
//    @Select("select * from class where id =#{id}")
//    public User quUser1id(int id);
//
//}
