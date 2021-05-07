import Config.springConfig;
import InnerBean.Emp;
import ListConne.stuu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhujiescan.Scantest;


public class test01 {

    @Test
    public void testBean(){

        //1.加载spring配置文件有两种方式
        //1.1 BeanFactory 2.ApplicationContext,其中BeanFactory是ApplicationContext的父类
        //BeanFactory加载配置文件的时候不回去创建对象，在获取对象(使用)才去创建对象（懒汉模式）
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext加载配置文件时候就会把配置文件对象进行创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置对象
        springTest springtest = context.getBean("springtest", springTest.class);

        System.out.println(springtest);

        springtest.test();
    }

    @Test
    public void testBean2(){

        //1.加载spring配置文件有两种方式
        //1.1 BeanFactory 2.ApplicationContext,其中BeanFactory是ApplicationContext的父类
        //BeanFactory加载配置文件的时候不回去创建对象，在获取对象(使用)才去创建对象（懒汉模式）
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext加载配置文件时候就会把配置文件对象进行创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);

        emp.add();
    }

    @Test
    public void testBean3(){

        //1.加载spring配置文件有两种方式
        //1.1 BeanFactory 2.ApplicationContext,其中BeanFactory是ApplicationContext的父类
        //BeanFactory加载配置文件的时候不回去创建对象，在获取对象(使用)才去创建对象（懒汉模式）
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext加载配置文件时候就会把配置文件对象进行创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        //2.获取配置对象
        stuu emp = context.getBean("stu", stuu.class);

        System.out.println(emp);

        emp.add();
    }

    @Test
    public void testbean4scan(){

        //1.加载spring配置文件有两种方式
        //1.1 BeanFactory 2.ApplicationContext,其中BeanFactory是ApplicationContext的父类
        //BeanFactory加载配置文件的时候不回去创建对象，在获取对象(使用)才去创建对象（懒汉模式）
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext加载配置文件时候就会把配置文件对象进行创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4scan.xml");

        //2.获取配置对象
        Scantest scantest = context.getBean("scantest", Scantest.class);//这里的第一个参数就是注解中的value值

        System.out.println(scantest);

        scantest.add();
    }

    @Test
    public void testConfigscan(){

        //1.加载spring配置文件有两种方式
        //1.1 BeanFactory 2.ApplicationContext,其中BeanFactory是ApplicationContext的父类
        //BeanFactory加载配置文件的时候不回去创建对象，在获取对象(使用)才去创建对象（懒汉模式）
        //BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");
        //ApplicationContext加载配置文件时候就会把配置文件对象进行创建
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.springConfig.class);

        //2.获取配置对象
        Scantest scantest = context.getBean("scantest", Scantest.class);//这里的第一个参数就是注解中的value值

        System.out.println(scantest);

        scantest.add();
    }

}
