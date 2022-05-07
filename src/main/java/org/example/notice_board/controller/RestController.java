package org.example.notice_board.controller;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dto.BoardDto;
import org.example.notice_board.service.BoardService;
import org.example.notice_board.vo.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class RestController {
    private final BoardService boardService;

    @PostMapping(value = "/board/{boardId}")
    public @ResponseBody Long setBoard(@PathVariable long boardId, @RequestBody BoardVO boardVO) {
        return boardService.setBoard(boardId, boardVO);
    }

    @PutMapping(value = "/board/{boardId}")
    public @ResponseBody Long updateBoard(@PathVariable long boardId, @RequestBody BoardVO boardVO) {
        return boardService.updateBoard(boardId, boardVO);
    }

    @GetMapping("/board")
    public @ResponseBody List<BoardDto> getBoards() {
        return boardService.getBoards();
    }

    @DeleteMapping(value = "/board/{boardId}")
    public @ResponseBody Long deleteBoard(@PathVariable long boardId) {
        boardService.deleteBoard(boardId);
        //TODO change this
        return boardId;
    }
}
