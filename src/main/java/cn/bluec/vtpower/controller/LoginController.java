package cn.bluec.vtpower.controller;

import cn.bluec.vtpower.entity.User;
import cn.bluec.vtpower.service.UserService;
import cn.bluec.vtpower.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/login")
    public User login(@RequestParam("username") String name, @RequestParam("password") String password) {
        return userServiceImpl.findByName(name,password);
    }

    @GetMapping(value = {"/do_login"})
    public String login() {
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "home"; //当浏览器输入/index时，会返回 /templates/home.html页面
    }

}
