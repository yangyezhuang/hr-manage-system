package com.yyz.hrms.util;

import com.yyz.hrms.entity.User;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息，用于代替session对象
 *
 * @author YZ.YANG
 * @date 2023-09-09 18:12
 */
@Component
public class HostHolder {
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear() {
        users.remove();
    }

}
