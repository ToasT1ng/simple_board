package org.example.notice_board.service;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dao.CommonDao;
import org.example.notice_board.dto.BoardDto;
import org.example.notice_board.util.DBIdGenerator;
import org.example.notice_board.vo.BoardVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final CommonDao<BoardDto> boardDao;

    public List<BoardDto> getBoards() {
        return boardDao.selectAll();
    }

    public BoardDto getBoard(long id) {
        return boardDao.selectOne(id);
    }

    public long setBoard(BoardVO boardVO) {
        BoardDto boardDto = boardVO.toDto(DBIdGenerator.makeId());
        return boardDao.insertOne(boardDto);
    }

    public long updateBoard(long id, BoardVO boardVO) {
        BoardDto boardDto = boardVO.toDto(id);
        boardDao.updateOne(boardDto);
        return id;
    }

    public long deleteBoard(long boardId) {
        boardDao.deleteOne(boardId);
        return boardId;
    }
}
