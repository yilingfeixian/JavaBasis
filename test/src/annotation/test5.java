package annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * @author: Allen Shu
 * @date: 2020/8/26
 * @description 注解可以向编译器、虚拟机等解释说明一些事情。举一个最常见的例子，
 * 当我们在子类当中覆写父类的aMethod方法时，在子类的aMethod上会用@Override来修饰它，
 * 反之，如果我们给子类的bMethod用@Override注解修饰，但是在它的父类当中并没有这个bMethod，
 * 那么就会报错。这个@Override就是一种注解，它的作用是告诉编译器它所注解的方法是重写父类的方法，这样编译器就会去检查父类是否存在这个方法。
 * 注解是用来描述Java代码的，它既能被编译器解析，也能在运行时被解析。
 * <p>
 * https://www.jianshu.com/p/2585d2a7cd97
 * <p>
 * 元注解是描述注解的注解
 * <p>
 * 以下只探究自定义注解
 */
public class test5 {
    public static void main(String[] args) {
        RuntimeMethodInfoTest test = new RuntimeMethodInfoTest();
        Class cls = RuntimeMethodInfoTest.class;
        for (Method method : cls.getMethods()) {
            RuntimeMethodInfo runtimeMethodInfo = method.getAnnotation(RuntimeMethodInfo.class);
            if (runtimeMethodInfo != null) {
                System.out.println("RuntimeMethodInfo author=" + runtimeMethodInfo.author());
                System.out.println("RuntimeMethodInfo data=" + runtimeMethodInfo.data());
                System.out.println("RuntimeMethodInfo version=" + runtimeMethodInfo.version());
            }
        }
        try {
            Method addMethod = cls.getMethod("testRuntimeMethodInfo", null);
            addMethod.invoke(test,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Inherited
@interface RuntimeMethodInfo {
    String author() default "tony";

    String data();

    int version() default 1;
}

class RuntimeMethodInfoTest {
    @RuntimeMethodInfo(data = "1111", version = 2)
    public void testRuntimeMethodInfo() {
        System.out.println("testRuntimeMethodInfo");
    }
}
