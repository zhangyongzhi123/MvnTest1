package InnerBean;


import org.junit.Test;

public class Emp {
    private String name;
    private String age;
    private Dptm dpmt;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setDpmt(Dptm dpmt) {
        this.dpmt = dpmt;
    }

    public void add(){
        System.out.println(name.toString()+"||"+age.toString()+"||"+dpmt.toString());
    }
}
