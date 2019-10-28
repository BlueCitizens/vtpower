package cn.bluec.vtpower.service;

import cn.bluec.vtpower.entity.User;

import java.util.List;

public interface UserService extends BaseService<User> {
    User findByName(String name,String password);
}
