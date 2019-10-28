package cn.bluec.vtpower.service;

import cn.bluec.vtpower.entity.User;
import cn.bluec.vtpower.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findByName(String name,String password){
        return userMapper.findByName(name,password);
    }
}
