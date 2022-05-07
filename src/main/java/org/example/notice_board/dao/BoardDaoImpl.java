package org.example.notice_board.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.notice_board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDaoImpl implements CommonDao<BoardDto> {
    @Autowired
    private SqlSession sqlSession;

    private static final String namespace = "org.example.notice_board.BoardMapper";

    @Override
    public long insertOne(BoardDto vo) {
        return sqlSession.insert(namespace + ".insertBoardOne", vo);
    }

    @Override
    public List<BoardDto> selectAll() {
        return sqlSession.selectList(namespace + ".selectBoards");
    }

    @Override
    public BoardDto selectOne(long boardId) {
        return sqlSession.selectOne(namespace + ".selectBoard", boardId);
    }

    @Override
    public void updateOne(BoardDto vo) {
        sqlSession.update(namespace + ".updateBoardOne", vo);
    }

    @Override
    public void deleteOne(long boardId) {
        sqlSession.update(namespace + ".deleteBoardOne", boardId);
    }
}
