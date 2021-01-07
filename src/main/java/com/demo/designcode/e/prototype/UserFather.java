package com.demo.designcode.e.prototype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class UserFather implements Cloneable {
    /**
     * 一定要继承 Cloneable
     */
    private String name;
    private User user;

    @Override
    public UserFather clone() throws CloneNotSupportedException {
        UserFather userFather = null;
        userFather = (UserFather) super.clone();
        userFather.user = this.user.clone();
        return userFather;
    }
}
