package basic;

/**
 * 1.1 对 Java 多态的理解
 * <p>
 * 面向对象编程的三大特性：封装、继承、多态。
 * <p>
 * 封装：隐藏类的内部实现机制。
 * 继承：重用父类代码，为多态做铺垫。
 * 多态：程序中定义的引用变量所指向的具体类型和通过该引用变量发出的方法调用在编程时并不确定，而是在程序运行期间才确定。
 * 实现多态的三个必要条件：继承、重写、向上转型。
 * <p>
 * 继承：在多态中必须存在有继承关系的子类和父类。
 * 重写：子类对父类中的某些方法进行重新定义，在调用这些方法时就会调用子类的方法。
 * 向上转型：将父类引用指向子类对象，只有这样，该引用才具备调用子类方法的能力。
 * <p>
 * 1.2 父类静态方法能不能被子类重写
 * 结论
 * 父类的静态方法可以被子类继承，但是不能被子类重写。
 * <p>
 * 当子类声明了一个与父类相同的静态方法时，只能称为隐藏。
 *
 */
public class test1 {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.method();
        parent.staticMethod();

        Child child = new Child();
        child.method();
        child.staticMethod();
    }
}

class Parent {

    public static void staticMethod() {
        System.out.println("basic.Parent Static Method");
    }

    public void method() {
        System.out.println("basic.Parent Method");
    }
}

class Child extends Parent {

    public static void staticMethod() {
        System.out.println("basic.Child Static Method");
    }

    public void method() {
        System.out.println("basic.Child Method");
    }
}
