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

import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/login")
    public User login(@RequestParam("entry_name") String name, @RequestParam("entry_password") String password) {
        User user1 = userServiceImpl.findByName(name,password);

        System.out.print(user1);

        if(user1==null){
            return null;
        }else {
            System.out.println("success"+user1.toString());
            return user1;
        }
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
