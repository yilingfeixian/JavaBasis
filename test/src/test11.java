import java.util.ArrayList;
import java.util.List;

/**
 * @author: Allen Shu
 * @date: 2020/8/28
 * @description
 * https://www.jianshu.com/p/74f4dbdaa5f4
 */
public class test11 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //编译期异常：illegal generic type of instanceof
        System.out.println("instanceof=" + (list instanceof List<String>));
    }
}
