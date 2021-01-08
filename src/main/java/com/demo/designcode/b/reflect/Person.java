package com.demo.designcode.b.reflect;

/**
 * @author hong-2000
 * @description
 * @create 2021/1/4 17:50
 */
class Person {
    public Person() {
        System.out.print("无参构造-Person\t");
    }

    @Override
    public String toString() {
        return "hello! Person";
    }
}
