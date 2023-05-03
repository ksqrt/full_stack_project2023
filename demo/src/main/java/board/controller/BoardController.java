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
        boardDTO.setName("김동빈");
        boardDTO.setSubject("뚜루뚜루뚜ㅇㅇ");
        boardDTO.setContent("빠라빠라빰ㅇㅇ");
        boardDTO.setLogtime(new Date());
        list.add(boardDTO);

        boardDTO = new BoardDTO();
        boardDTO.setSeq(2);
        boardDTO.setName("이우영");
        boardDTO.setSubject("검정고무신");
        boardDTO.setContent("주인공 기영의 생활");
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
 */