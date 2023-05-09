package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.bean.UserDTO;
import user.service.UserService;

import java.util.List;

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
    @GetMapping("list")
    public String list (){
        return "user/list";
    }

    @PostMapping("getUserList")
    @ResponseBody
    public List<UserDTO> getUserList(){
        List<UserDTO> list = userService.getUserList();
        return list;
    }

    @PostMapping("isExistId")
    @ResponseBody
    public String isExistId(@RequestParam String id){
        String isExistId = userService.isExistId(id);
        return isExistId;
    }
}


