package basic;

/**
 * @author: Allen Shu
 * @date: 2020/8/26
 * @description 成员内部类：作为外部类的成员，可以直接使用外部类的所有成员和方法。
 * 静态内部类：声明为static的内部类，成员内部类不能有static数据和static方法，但嵌套内部类可以。
 * 局部内部类：内部类定义在方法和作用域内。只在该方法或条件的作用域内才能使用，退出作用域后无法使用。
 * 匿名内部类：匿名内部类有几个特点：不能加访问修饰符；当所在方法的形参需要被内部类里面使用时，该形参必须为final。
 */
public class test3 {
    private int a;

    //成员内部类
    class c1 {
        private int b;

        c1() {
            b = a;
//            c2.c22();
        }

    }

    //静态内部类
    static class c2 {
        private int b;

        c2() {
//            b = a;
        }

        void c21() {

        }

        static void c22() {

        }
    }

    //局部内部类

    public void method(){
        class inner{

        }
    }

    //匿名内部类
    //abstract class Person {
    //    public abstract void eat();
    //}
    //
    //public class Demo {
    //    public static void main(String[] args) {
    //        Person p = new Person() {
    //            public void eat() {
    //                System.out.println("eat something");
    //            }
    //        };
    //        p.eat();
    //    }
    //}

}
