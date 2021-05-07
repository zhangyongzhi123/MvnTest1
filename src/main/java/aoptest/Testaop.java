package aoptest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testaop {
    @Test
    public void testAdopadd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        zhang bean = context.getBean(zhang.class);
        bean.add();

    }
}
