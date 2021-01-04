package cn.zqhblog.designcode.b.reflect;

/**
 * JAVA反射机制是在运行状态中，
 * 对于任意一个类，都能够知道这个类的所有属性和方法；
 * 对于任意一个对象，都能够调用它的任意方法和属性；
 * 这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制。
 */

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
public class ReflectImpl {
    public static void main(String[] args) {
        System.out.println("\t-----Class类对象的三种实例化模式-----");
        /**
         * 1.Object类支持
         */
        Person person = new Person();
        Class<? extends Person> cls = person.getClass();
        System.out.println(cls + "\t" + cls.getName());
        /**
         * 2.JVM直接支持
         */
        Class<? extends Person> cls2 = Person.class;
        System.out.println(cls2 + "\t" + cls2.getName());
        /**
         * 3.Class类支持
         * 这种模式最大的特点是可以直接采用字符串的形式定义要使用的类型，并且程序不需要编写任何的import语句。
         * 异常：java.lang.ClassNotFoundException: ComparableImpl.Student
         */
        try {
            //字符串
            Class<?> cls3 = Class.forName("cn.zqhblog.designcode.b.reflect.Person");
            System.out.println(cls3.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\t-----运用反射实例化对象-----");
        /**
         * JDK1.9以前的实例化
         * 代替了new
         */
        try {
            Class<?> cls3 = Class.forName("cn.zqhblog.designcode.b.reflect.Person");
            Object object = cls3.newInstance();
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * JDK1.9之后newInstance()被替代
         * 因为默认的Class类中的newInstance()方法只能调用无参构造。后来的改写(构造方法会讲解)
         * JDK1.9以后的实例化
         */
        try {
            Class<?> cls3 = Class.forName("cn.zqhblog.designcode.b.reflect.Person");
            Object object = cls3.getDeclaredConstructor().newInstance();
            System.out.println(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
