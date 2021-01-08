package com.demo.designcode.e.prototype;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

/**
 * @author hong-2000
 * @description 原型
 * @create 2021/1/4 17:50
 */
@Slf4j
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(3);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(85);
        User user = User.builder().name("lisa").age(6).grade(arrayList).build();
        System.out.println(user.toString());

        User userClone = user.clone();
        userClone.setName("tom");
        userClone.addGrade(90);
        System.out.println(userClone.toString());

        System.out.println(userClone.clone().toString());

        System.out.println();

        UserFather userFather = UserFather.builder().name("father").user(userClone).build();
        System.out.println(userFather.toString());

        System.out.println();

        System.out.println(userFather.clone().toString());
    }
}
