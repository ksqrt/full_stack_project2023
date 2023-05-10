package user.service;

import user.bean.UserDTO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService {
    public void write(UserDTO userDTO);

    public List<UserDTO> getUserList();

    public String isExistId(String id);

    public List<UserDTO> search(Map<String, String> map);

    public Optional<UserDTO> getUser(String id);
}
