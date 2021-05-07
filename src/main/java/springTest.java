
public class springTest {

    private String name;
    private String zname;
    private String home;

    public void setName(String name) {
        this.name = name;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public void setHome(String home) {
        this.home = home;
    }
    //    public springTest(String name, String zname,String home) {
//        this.name = name;
//        this.zname = zname;
//        this.home = home;
//    }

    public void test(){
        System.out.println(name.toString()+"||"+zname.toString()+"||"+home.toString());
    }
}
