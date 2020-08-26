/**
 * @author: Allen Shu
 * @date: 2020/8/26
 * @description 静态>动态 变量>方法
 * https://www.jianshu.com/p/e1e00bbf29dc
 */
public class test8 {
    public static void main(String[] args) {
        new ClassChild();
    }
}

/**
 * 加载父类构造器
 * 为父类实例对象分配存储空间并赋值
 * 执行父类的初始化块
 * 执行父类构造函数
 * 加载子类加载器
 * 为子类实例对象分配存储控件并赋值
 * 执行子类的初始化块
 * 执行子类构造函数
 */
class ClassOther {

    public int mNumber;

    public ClassOther() {
        System.out.println("ClassOther Constructor");
    }

    public void setNumber(int number) {
        this.mNumber = number;
    }

    public int getNumber() {
        return mNumber;
    }
}

class ClassParent {

    {
        System.out.println("ClassParent before mClassParentContent");
    }

    private ClassOther mClassParentContent = new ClassOther();

    {
        System.out.println("ClassParent after mClassParentContent=" + mClassParentContent.mNumber);
    }

    public ClassParent(int number) {
        mClassParentContent.setNumber(number);
        System.out.println("ClassParent Constructor, mClassParentContent=" + mClassParentContent.mNumber);
    }


}

class ClassChild extends ClassParent {

    {
        System.out.println("ClassChild before a");
    }

    private int mClassChildContent = 1;

    {
        System.out.println("ClassChild after mClassChildContent=" + mClassChildContent);
    }

    public ClassChild() {
        super(2);
        System.out.println("ClassChild Constructor");
    }
}