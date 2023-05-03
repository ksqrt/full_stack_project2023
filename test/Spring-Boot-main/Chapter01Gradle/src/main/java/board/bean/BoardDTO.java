package board.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class BoardDTO {
	private int seq;
	private String name;
	private String subject;
	private String content;
	private Date logtime;
}
