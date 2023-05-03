package user.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import user.bean.UserDTO;
import user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired //설정된 Bean들 중에서 UserService를 찾아서 연결해라 UserServiceImpl이 UserService랑 연결되어 있어 UserServiceImpl을 연결한다.
	private UserService userService;
	
	
	@GetMapping(value="/writeForm")
	public String writeForm() {
		
		return "user/writeForm";
	}
	
	@PostMapping(value="/write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
		
	}
	
	@GetMapping(value="list")
	public String list(@RequestParam(required = false, defaultValue = "1") String pg, Model model) {
		//DB를 거치지 않고 바로 화면에 틀만 띄운다.
		model.addAttribute("pg", pg);
		return "user/list";
	}
	
	@PostMapping(value="getUserList")
	@ResponseBody
	public Map<String, Object> getUserList(@RequestParam String pg) {
//		List<UserDTO> list = userService.getUserList();
//		return list
		
		return userService.getUserList(pg);
	}
	
	@PostMapping(value="isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		
		return userService.isExistId(id);
	}
	
	
	@GetMapping(value="updateForm")
	public String updateForm() {
		
		return "user/updateForm";
	}
	
	@PostMapping(value="getUser")
	@ResponseBody
	public UserDTO getUser(@RequestParam String id) {
		
		return userService.getUser(id);
	}
	
	@PostMapping(value="update")
	@ResponseBody
	public void update(@ModelAttribute UserDTO userDTO) {
		
		userService.update(userDTO);
	}
	
	@GetMapping(value="deleteForm")
	public String deleteForm() {
		
		return "user/deleteForm";
	}
	
	@PostMapping(value="delete")
	@ResponseBody
	public void delete(@RequestParam String id) {
		
		userService.delete(id);
	}
	
	
}







