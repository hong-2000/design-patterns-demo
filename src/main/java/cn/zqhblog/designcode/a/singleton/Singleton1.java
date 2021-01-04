package cn.zqhblog.designcode.a.singleton;

/**
 * 饿汉式
 */
class Singleton1{
	private static final Singleton1 INSTANCE = new Singleton1();
	private Singleton1(){
	    System.out.println(Thread.currentThread().getName()+"\tSingleton");
	}
	public static Singleton1 getInstance(){return INSTANCE;}
    public void print(){
        System.out.println("hi! Singleton!");
    }
}
