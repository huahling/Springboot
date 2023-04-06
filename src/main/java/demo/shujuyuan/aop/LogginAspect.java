//package demo.shujuyuan.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//public class LogginAspect {
//
//    @Pointcut("execution(public * demo.shujuyuan.Test1.service.*.*(..))")
//    public void abc(){}
//
//    @Before("abc()")
//    public void aa(JoinPoint joinPoint){
//        System.out.println("前");
//    }
//
//    @After("abc()")
//    public void bb(JoinPoint joinPoint){
//        System.out.println("后");
//    }
//}
