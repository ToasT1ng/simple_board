package org.example.notice_board.controller;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dto.BoardDto;
import org.example.notice_board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class RestController {
    private final BoardService boardService;

    @PostMapping(value = "/setBoard")
    public @ResponseBody BoardDto setBoard(@RequestBody BoardDto boardDto) {
        return boardService.setBoard(boardDto);
    }

    @PutMapping(value = "/updateBoard")
    public @ResponseBody BoardDto updateBoard(@RequestBody BoardDto boardDto) {
        return boardService.updateBoard(boardDto);
    }

    @GetMapping("/getBoards")
    public @ResponseBody List<BoardDto> getBoards() {
        return boardService.getBoards();
    }

    @PutMapping(value = "/deleteBoard/{boardId}")
    public @ResponseBody String deleteBoard(@PathVariable String boardId) {
        return boardService.deleteBoard(boardId);
    }
}
