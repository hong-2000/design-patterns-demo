package com.demo.designcode.e.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @author QingHong
 * @description
 * @QQ 2560612959
 * @create 2021/1/4 17:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Cloneable {
    private String name;
    private int age;
    private ArrayList<Integer> grade;

    @Override
    public User clone() throws CloneNotSupportedException {
        User user = null;
        user = (User) super.clone();
        return user;
    }

    public void addGrade(Integer value) {
        grade.add(value);
    }
}
