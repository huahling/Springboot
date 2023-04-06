//package demo.shujuyuan.controller;
//
//import demo.shujuyuan.Test1.service.UserService1;
//
//
//import org.apache.logging.log4j.LogManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Usercontroller {
//
//    private static final org.apache.logging.log4j.Logger log = LogManager.getLogger(Usercontroller.class);
//
//    @Autowired
//    private UserService1 userService1;
//
////    @Autowired
////    private UserService2 userService2;
//
////    @Autowired
////    private UserService3 userService3;
//
//    @RequestMapping("/ss")
//    public String ss() throws InterruptedException {
////        log.info("xxxxxxxxxxxxxxx");
////        userService1.useradd1();
////
////        userService2.useradd2();
//
//        userService1.tianjia();
////            userService1.queryuser1();
////            userService1.queryuser2();
//
////        userService3.useradd3();
//        return "成功";
//    }
//
//    @Value("${name}")
//    private String aa;
//
//    @RequestMapping("/aa")
//    public String aa()   {
//        System.out.println(aa);
//        return "成功";
//    }
//
//    @RequestMapping("/ts")
//    public String ts()   {
//        System.out.println(aa);
//        return "test";
//    }
//}
