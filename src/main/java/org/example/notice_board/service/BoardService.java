package org.example.notice_board.service;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dao.BoardDaoImpl;
import org.example.notice_board.dto.BoardDto;
import org.example.notice_board.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDaoImpl boardDao;

    public List<BoardDto> getBoards() {
        return boardDao.selectAll();
    }

    public long setBoard(Long id, BoardVO boardVO) {
        boardDao.insertOne(boardVO);
        return id;
    }

    public long updateBoard(Long id, BoardVO boardVO) {
        boardDao.updateOne(boardVO);
        return id;
    }

    public long deleteBoard(long boardId) {
        boardDao.deleteBoard(boardId);
        return boardId;
    }
}
