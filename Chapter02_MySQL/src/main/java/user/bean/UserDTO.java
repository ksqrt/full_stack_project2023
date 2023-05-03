package user.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserDTO {
	private String name;
	private String id;
	private String pwd;
}
