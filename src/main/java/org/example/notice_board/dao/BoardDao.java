package org.example.notice_board.dao;

import org.example.notice_board.dto.BoardDto;

import java.util.List;

public interface BoardDao {
    void insertOne(BoardDto boardDto);
    List<BoardDto> selectAll();

    void updateOne(BoardDto boardDto);

    void deleteBoard(String boardId);
}
