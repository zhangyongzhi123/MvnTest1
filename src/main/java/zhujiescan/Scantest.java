package zhujiescan;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
//import javax.annotation.Resources;
//(1)@Component
//(2)@Service
//(3)@Controller
//(4)@Repository
//上面的4个注解功能是一样的，都可以用来创建bean实例

/*
* 基于注解方式实现属性注入
* 针对对象类型的注入
* （1）@Autowired；根据属性类型进行自动装配
*
*（2）@Qualifier;根据属性名称进行注入
*
*（3）@Resource;可以根据类型注入，也可以根据名称注入
*
* 针对普通类型属性的注入
* （4）@Value;注入普通属性类型
* */

//如果里面的value值不写的话，spring会默认为你的类名第一个字母小写
@Repository(value = "scantest")
public class Scantest {

    //定义对象类，注解方式不需要set方式，注解已经帮实现了
    @Resource(name = "userxv")
    //@Qualifier(value = "userxv")
    private Userzhang userzhang;

    //定义普通属性的注入
    @Value(value = "xvhuarong")
    private String name;

    public void add(){
        System.out.println("add....zhangyongzhi"+name);
        userzhang.add();
    }
}
