package basic;

/**
 * 2.1 Java 中 ==、equals 和 hashCode 的区别
 *
 */
public class test2 {
    public static void main(String[] args) {
        Integer integer1 = new Integer(20);
        Integer integer2 = 20;
        System.out.println(integer1 == integer2);

        Integer integer3 = new Integer(20);
        System.out.println(integer1 == integer3);

        //拆箱
        int int4 = 20;
        System.out.println(integer1 == int4);


        String ab = "ab";
        String cd = "cd";
        String abcd = ab + cd;
        String s = "abcd";
        System.out.println(abcd == s);


    }
}
