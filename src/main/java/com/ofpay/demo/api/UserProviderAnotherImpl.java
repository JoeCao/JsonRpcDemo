package com.ofpay.demo.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caozupeng on 15-4-10.
 */
public class UserProviderAnotherImpl implements UserProvider {

    public boolean isLimit(Gender gender, String name) {
        return Gender.MAN == gender;
    }

    public User getUser(String userId) {
        return new User(userId, "Joe", 48);
    }

    public User queryUser(User user) {
        return new User(user.getId(), "get:" + user.getName(), user.getAge() + 18);
    }

    public Map<String, User> queryAll() {
        Map<String, User> map = new HashMap<String, User>();
        map.put("001", new User("001", "Joe", 18));
        map.put("002", new User("002", "Wen", 20));

        return map;
    }
}
