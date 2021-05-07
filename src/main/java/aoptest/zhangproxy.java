package aoptest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect   //生成代理对象
public class zhangproxy {

    //可使用字符串代替注解中的value
    final String str = "execution(* aoptest.zhang.add(..))";

    //前置增强，@Before表示前置增强，意思就是在被加强的方法前执行
    //"execution(* aoptest.zhang(..))"为执行表达式，表示这个前置增强所作用的类的位置，其中execution的第一个*表示返回类型，第二个表示被加强方法的位置，括号中为被加强方式的参数
    @Before(value = str)
    public void Before(){
        System.out.println("hua");
    }



    //后置增强，@After表示后置增强，意思就是在被加强的方法后执行，最终通知，相当于finally，无论有没有异常都会执行
    @After(value = "execution(* aoptest.zhang.add(..))")
    public void After(){
        System.out.println("after.....");
    }

    //后置增强，@After表示后置增强，意思就是在被加强的方法后执行，有异常的时候会不执行
    @AfterReturning(value = "execution(* aoptest.zhang.add(..))")
    public void Afterreturing(){
        System.out.println("Afterreturing.....");
    }

    //环绕增强
    @Around(value = "execution(* aoptest.zhang.add(..))")
    public void around(ProceedingJoinPoint ProceedingJoinpoint) throws Throwable {
        System.out.println("around前。。。");
        ProceedingJoinpoint.proceed();
        System.out.println("around后。。。");
    }

}
