package com.cyd.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 使用注解方式实现 aop
@Aspect // 标注这个类是一个切面
public class AnnotationPointCut {
    @Before("execution(* com.cyd.service.UserServiceImpl.*(..))") // 切入点
    public void before(){
        System.out.println("=++++++++++++++before+++++++++++");
    }
    @After("execution(* com.cyd.service.UserServiceImpl.*(..))") // 切入点
    public void after(){
        System.out.println("+++++++++after+++++++++");
    }
    // 在环绕增强中，我们可以给定一个参数，代表我们要获得处理切入的点
    @Around("execution(* com.cyd.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint p) throws Throwable{
        System.out.println("before");
        // 执行的时候会拿到的参数
        Object proceed = p.proceed(); // 执行方法，执行完这个就会结束方法，到after
        Signature signature = p.getSignature();// 获得签名，谁被执行
        System.out.println(signature);
        System.out.println(proceed);
        //环绕后
        System.out.println("after");
    }
}
