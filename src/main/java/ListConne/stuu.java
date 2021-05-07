package ListConne;

import com.google.common.collect.Maps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class stuu {
    //数组类型属性
    private String[] courses;

    //list集合类型属性
    private List<String> list;

    //map集合的属性
    private Map<String,String> map;

    //set集合属性
    private Set<String> set;

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

//    @Override
//    public String toString() {
//        return "stuu{" +
//                "map," + map +
//                '}';
//    }

    public void add(){
        System.out.println(Arrays.toString(courses));
        System.out.println(list);
        System.out.println(map);
        System.out.println(set);


    }
}
