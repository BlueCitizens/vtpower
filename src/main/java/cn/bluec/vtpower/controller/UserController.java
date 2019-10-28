package cn.bluec.vtpower.controller;

import cn.bluec.vtpower.entity.User;
import cn.bluec.vtpower.service.UserService;
import cn.bluec.vtpower.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/findall")
    public List<User> findAll(){
        return userService.findAll();
    }
}
