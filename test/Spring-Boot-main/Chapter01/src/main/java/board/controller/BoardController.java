package board.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import board.bean.BoardDTO;

@RestController //RestController가 객체가 넘어오면 자동으로 JSON형식으로 바꿔줌
public class BoardController {
	
	public BoardController() {
		System.out.println("BoardController 기본 생성자");
	}
	
	@GetMapping(value="/board/hello")
	//@ResponseBody
	public String hello(String name) {
		
		return "안녕하세요 " + name + "님";
	}
	
	@GetMapping(value="/board/getBoardList") 
	public List<BoardDTO> getBoardList() { //RestController가 객체가 넘어오면 자동으로 JSON형식으로 바꿔줌
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setSeq(1);
		boardDTO.setName("왕갈비통닭");
		boardDTO.setSubject("지금까지 이런 치킨은 없었다");
		boardDTO.setContent("이것은 갈비인가 통닭인가");
		boardDTO.setLogtime(new Date());
		list.add(boardDTO);
		
		boardDTO = new BoardDTO();
		boardDTO.setSeq(2);
		boardDTO.setName("SIU");
		boardDTO.setSubject("신의탑");
		boardDTO.setContent("스물 다섯번째 밤");
		boardDTO.setLogtime(new Date());
		list.add(boardDTO);
		
		return list;
	}
	
}


/*
@RestController는 JSP 같은 뷰를 별도로 만들지 않는 대신에 
컨트롤러 메소드가 리턴하는 데이터 자체를 클라이언트로 보낸다. 
클라이언트에 전달되는 데이터는 문자열, DTO, 컬렉션 형태의 자바 객체인데, 
자바 객체가 전달되는 경우에는 자동으로 JSON으로 변환하여 처리하게 된다.

스프링 DevTools 사용

컨트롤러에 새로운 메소드가 추가되면 반드시 
실행 중인 애플리케이션을 중지하고 애플리케이션을 재실행해야 한다. 
그래야 수정된 컨트롤러가 반영되기 때문이다. 
그런데 컨트롤러를 수정할 때마다 매번 애플리케이션을 
재실행하는 것이 귀찮으면 스프링 부트가 제공하는 
DevTools 기능을 이용하게 되면 애플리케이션을 
재시작하지 않아도 된다. (스스로 서버가 reloading 한다.)
 */


