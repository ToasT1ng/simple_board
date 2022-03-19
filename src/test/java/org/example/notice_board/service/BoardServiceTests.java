//package org.example.notice_board.service;
//
//import org.example.notice_board.dto.BoardDto;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.mock;
//
//@ContextConfiguration(locations = { "applicationContext.xml" })
//public class BoardServiceTests {
//    @Autowired
//    public BoardService boardService;
//
//    @Test
//    public void getBoards() {
//        BoardService boardService = mock(BoardService.class);
//        List<BoardDto> boardDtos = boardService.getBoards();
//
//        assertNotNull(boardDtos);
//    }
//
//    @Test
//    public void setBoard() {
//        BoardService boardService = mock(BoardService.class);
//        BoardDto boardDto = BoardDto.builder()
//                .id(1)
//                .title("test")
//                .description("test!")
//                .deleted(false)
//                .build();
//        BoardDto result = boardService.setBoard(boardDto);
//
//        System.out.println(boardDto.toString());
//        System.out.println(result.toString());
//        assertEquals(result.getTitle(), boardDto.getTitle());
//    }
//
//}
