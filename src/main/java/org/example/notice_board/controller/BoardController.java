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
public class BoardController {
    private final BoardService boardService;

    @PostMapping(value = "/board")
    public @ResponseBody Long setBoard(@RequestBody BoardVO boardVO) {
        return boardService.setBoard(boardVO);
    }

    @PutMapping(value = "/board/{boardId}")
    public @ResponseBody Long updateBoard(@PathVariable long boardId, @RequestBody BoardVO boardVO) {
        return boardService.updateBoard(boardId, boardVO);
    }

    @GetMapping("/board")
    public @ResponseBody List<BoardDto> getBoards() {
        return boardService.getBoards();
    }

    @GetMapping("/board/{boardId}")
    public @ResponseBody BoardDto getBoard(@PathVariable long boardId) {
        return boardService.getBoard(boardId);
    }

    @DeleteMapping(value = "/board/{boardId}")
    public @ResponseBody Long deleteBoard(@PathVariable long boardId) {
        return boardService.deleteBoard(boardId);
    }
}
