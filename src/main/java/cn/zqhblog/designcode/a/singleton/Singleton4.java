package cn.zqhblog.designcode.a.singleton;

/**
 * 懒汉式
 * 实例化部分加synchronized
 */
class Singleton4{
    private static Singleton4 instance = null;
    private Singleton4(){
        System.out.println(Thread.currentThread().getName()+"\tSingleton");
    }
    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized(Singleton4.class){
                instance = new Singleton4();
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("hi! Singleton!");
    }
}
