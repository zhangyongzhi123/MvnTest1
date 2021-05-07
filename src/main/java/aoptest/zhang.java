package aoptest;

import org.springframework.stereotype.Component;

//被增强的类
@Component
public class zhang {
    public void add(){
        System.out.println("hello...");
    }
}
