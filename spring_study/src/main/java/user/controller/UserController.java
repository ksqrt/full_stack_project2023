package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.bean.UserDTO;
import user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("writeForm")
    public String writeForm() {
        return "user/writeForm";
    }
    @PostMapping("write")
    @ResponseBody
    public void write (@ModelAttribute UserDTO userDTO){
        userService.write(userDTO);
    }
}


