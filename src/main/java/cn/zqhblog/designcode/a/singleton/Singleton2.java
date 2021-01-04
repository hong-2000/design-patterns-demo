package cn.zqhblog.designcode.a.singleton;

/**
 * 懒汉式
 * static、private版
 */
class Singleton2{
    private static Singleton2 instance = null;
    private Singleton2(){
        System.out.println(Thread.currentThread().getName()+"\tSingleton");
    }
    public static Singleton2 getInstance(){
		if(instance == null){
		    instance = new Singleton2();
		}
        return instance;
    }
    public void print(){
        System.out.println("hi! Singleton!");
    }
}
