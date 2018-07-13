package com.qianmi.demo.api;

import com.alibaba.dubbo.rpc.RpcContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caozupeng on 15-4-10.
 */
public class UserProviderAnotherImpl implements UserProvider {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public boolean isLimit(Gender gender, String name) {
        logger.info(String.format("input gender=%sand name=%s", gender, name));
        return Gender.MAN == gender;
    }

    @Override
    public User getUser(String userId) {
        int localPort = RpcContext.getContext().getLocalPort();
        String localHost = RpcContext.getContext().getLocalHost();
        logger.info("服务器ip：" + localHost + " 服务端口：" + localPort);
        logger.info("input userId = " + userId);
        return new User(userId, String.format("%s:%d Joe", localHost, localPort), 48);
    }

    @Override
    public User getUser(int userCode) {
        logger.info("input userCode = " + userCode);
        return new User(String.valueOf(userCode), "userCode get", 48);
    }

    @Override
    public User queryUser(User user) {
        logger.info("input user = " + user);
        return new User(user.getId(), "get:" + user.getName(), user.getAge() + 18);
    }

    @Override
    public Map<String, User> queryAll() {
        logger.info("input");
        Map<String, User> map = new HashMap<String, User>();
        map.put("001", new User("001", "Joe", 18));
        map.put("002", new User("002", "Wen", 20));

        return map;
    }

    @Override
    public void gotException() throws ServerException {
        ServerException demoException = new ServerException(100, "测试的异常");
        throw demoException;
    }
}
