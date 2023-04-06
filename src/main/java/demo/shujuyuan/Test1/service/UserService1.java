//package demo.shujuyuan.Test1.service;
//
//import demo.shujuyuan.Test1.dao.UserMapper1;
//import demo.shujuyuan.Test1.entity.User;
//import demo.shujuyuan.Test2.dao.UserMapper2;
//import demo.shujuyuan.Test2.service.UserService2;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//
//@Service
//@Transactional
//public class UserService1 {
//
//    @Resource
//    private UserMapper1 userMapper1;
//
//    @Autowired
//    private UserService2 service2;
//
////    public int useradd1(){
////        return userMapper1.useradd1("name1","dizhione",1);
////    }
//
//    public void tianjia(){
//        //调用其他类的方法 得用它的service 里 因为有事务
//
//        userMapper1.useradd1("a","a",1);
//
////        service2.useradd2();
//
////        int a=1/0;
//        //service1 里的事务只能管到 自己  回滚自己的
//        // 管不到service2 里的
//    }
//
//    @Async  //异步
//    public void queryuser1() throws InterruptedException {
//        User user= userMapper1.quUser1id(10);
//        System.out.println(user.toString());
//        Thread.sleep(5*1000);
//    }
//
//    public void queryuser2()   {
//
//        User user1= userMapper1.quUser1id(10);
//        System.out.println(user1.toString());
//
//
//    }
//
//}
