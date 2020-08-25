package basic;

/**
 * @author: Allen Shu
 * @date: 2020/8/26
 * @description 七、异常
 * Java中定义了许多异常类，并定义了Throwable作为所有异常的超类，将异常划分为两类Error和Exception。
 * <p>
 * Error：程序中无法处理的错误，例如NoClassDefFoundError、OutOfMemory等，当此类错误发生时，JVM将终止进程。
 * Exception：程序本身可以处理的异常。
 * 运行时异常，RuntimeException及其子类，表示JVM在运行时可能出现的错误，例如空指针、数组越界等，一般是由逻辑错误引起。
 * 受检异常：除RuntimeException及其子类的异常。编译器会检查此类异常，并提示你处理本类异常 -
 * 要么使用try-catch捕获，要么使用throws语句抛出，否则编译不通过。
 */
public class test4 {
}
