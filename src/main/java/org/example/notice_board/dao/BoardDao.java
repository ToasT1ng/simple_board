package org.example.notice_board.dao;

import org.example.notice_board.dto.BoardDto;
import org.example.notice_board.vo.BoardVO;

import java.util.List;

public interface BoardDao {
    void insertOne(BoardVO boardDto);
    List<BoardDto> selectAll();

    void updateOne(BoardVO boardDto);

    void deleteBoard(long boardId);
}
