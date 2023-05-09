package user.service;

import user.bean.UserDTO;

import java.util.List;

public interface UserService {
    public void write(UserDTO userDTO);

    public List<UserDTO> getUserList();

    public String isExistId(String id);
}
