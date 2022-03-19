package org.example.notice_board.service;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dao.BoardDaoImpl;
import org.example.notice_board.dto.BoardDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDaoImpl boardDao;

    public List<BoardDto> getBoards() {
        return boardDao.selectAll();
    }

    public BoardDto setBoard(BoardDto boardDto) {
        boardDao.insertOne(boardDto);
        return boardDto;
    }

    public BoardDto updateBoard(BoardDto boardDto) {
        boardDao.updateOne(boardDto);
        return boardDto;
    }

    public String deleteBoard(String boardId) {
        boardDao.deleteBoard(boardId);
        return boardId;
    }
}
