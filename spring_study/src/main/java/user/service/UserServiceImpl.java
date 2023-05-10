package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.bean.UserDTO;
import user.dao.UserDAO;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;

    @Override
    public void write(UserDTO userDTO) {
        userDAO.save(userDTO);
    }

    @Override
    public List<UserDTO> getUserList() {
        return userDAO.findAll();
    }

    @Override
    public String isExistId(String id) {

//        널의 가능성이 있는 애들은 Optional 사용
        Optional<UserDTO>  userDTO  = userDAO.findById(id);
//        결과의 값이 없으면 Optional.empty 출력
        System.out.println(userDTO);
        if(userDTO.isPresent()) {
            return "exist";
        }else {
            return "non_exist";
        }

    }

    @Override
    public List<UserDTO> search(Map<String, String> map) {
//      쿼리 메소드
        String searchOption = map.get("searchOption");
        String keyword = map.get("keyword");
        if(searchOption.equals("name")){
            return userDAO.findByNameContaining(keyword);
        }
        else{
            return  userDAO.findByIdContaining(keyword);
        }

    }

    @Override
    public Optional<UserDTO> getUser(String id) {
        Optional<UserDTO> userDTO = userDAO.findById(id);
        System.out.println(userDTO);
        return userDTO;
    }
}
