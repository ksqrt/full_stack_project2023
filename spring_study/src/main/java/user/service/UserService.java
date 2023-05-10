package user.service;

import user.bean.UserDTO;

import java.util.List;
import java.util.Map;

public interface UserService {
    public void write(UserDTO userDTO);

    public List<UserDTO> getUserList();

    public String isExistId(String id);

    public List<UserDTO> search(Map<String, String> map);
}
