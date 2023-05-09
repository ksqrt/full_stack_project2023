package user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.bean.UserDTO;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("writeForm")
    public String writeForm() {
        return "user/writeForm";
    }
    @PostMapping("write")
    @ResponseBody
    public void write (@ModelAttribute UserDTO userDTO){

    }
}


