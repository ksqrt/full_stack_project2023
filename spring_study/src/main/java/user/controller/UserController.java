package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.bean.UserDTO;
import user.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    @PostMapping("search")
    @ResponseBody
    public List<UserDTO> search(@RequestParam Map<String,String> map) {
        List<UserDTO> list = userService.search(map);
        return list;
    }

    @GetMapping("updateForm")
    public String updateForm(){
        return "user/updateForm";
    }
    @PostMapping("getUser")
    @ResponseBody
    public Optional<UserDTO> getUser(@RequestParam String id) {
        Optional<UserDTO> userDTO = userService.getUser(id);
        return userDTO;
    }


}


