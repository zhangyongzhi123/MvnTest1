package zhujiescan;

import org.springframework.stereotype.Repository;

@Repository(value = "userxv")
public class Userxv implements Userzhang{

    @Override
    public void add() {
        System.out.println("zhangyongzhi");
    }
}
