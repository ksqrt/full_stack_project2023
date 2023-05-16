package user.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import user.bean.UserDTO;

import java.util.List;

@Repository
public interface UserDAO extends JpaRepository<UserDTO,String> {

//구현체가 없음 mybatis 가아니라  JpaRepository 에서 DB 를 조작합니다.

//    쿼리 메소드 select * from usertable where name like '%' || ? \\ '%'
    public List<UserDTO> findByNameContaining(String keword);

    public List<UserDTO> findByIdContaining(String keword);

    @Query("Select dto from UserDTO dto where dto.name like '%' || :keyword || '%' ")
    public List<userDTO> getUserSearchName(String keyword);
}

