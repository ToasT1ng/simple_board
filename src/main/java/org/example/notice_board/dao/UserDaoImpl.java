package org.example.notice_board.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.notice_board.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements CommonDao<UserDto> {
    @Autowired
    private SqlSession sqlSession;

    private static final String namespace = "org.example.notice_board.UserMapper";

    @Override
    public long insertOne(UserDto vo) {
        return sqlSession.insert(namespace + ".insertUserOne", vo);
    }

    @Override
    public List<UserDto> selectAll() {
        return sqlSession.selectList(namespace + ".selectUsers");
    }

    @Override
    public UserDto selectOne(long userId) {
        return sqlSession.selectOne(namespace + ".selectUser", userId);
    }

    @Override
    public void updateOne(UserDto vo) {
        sqlSession.update(namespace + ".updateUserOne", vo);
    }

    @Override
    public void deleteOne(long userId) {
        sqlSession.update(namespace + ".deleteUserOne", userId);
    }
}
