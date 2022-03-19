package org.example.notice_board.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.notice_board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    private SqlSession sqlSession;

    private static final String namespace = "org.example.notice_board.BoardMapper";

    @Override
    public void insertOne(BoardDto boardDto) {
        sqlSession.insert(namespace + ".insertBoardOne", boardDto);
    }

    @Override
    public List<BoardDto> selectAll() {
        return sqlSession.selectList(namespace + ".selectBoards");
    }

    @Override
    public void updateOne(BoardDto boardDto) {
        sqlSession.update(namespace + ".updateBoardOne", boardDto);
    }

    @Override
    public void deleteBoard(String boardId) {
        sqlSession.update(namespace + ".deleteBoardOne", boardId);
    }
}
