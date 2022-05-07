package org.example.notice_board.service;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dao.CommonDao;
import org.example.notice_board.dto.UserDto;
import org.example.notice_board.util.DBIdGenerator;
import org.example.notice_board.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final CommonDao<UserDto> userDao;

    public List<UserDto> getUsers() {
        return userDao.selectAll();
    }

    public UserDto getUser(long userId) {
        return userDao.selectOne(userId);
    }

    public long setUser(UserVO vo) {
        UserDto userDto = vo.toDto(DBIdGenerator.makeId());
        return userDao.insertOne(userDto);
    }

    public long updateUser(long userId, UserVO vo) {
        UserDto userDto = vo.toDto(userId);
        userDao.updateOne(userDto);
        return userId;
    }

    public long deleteUser(long userId) {
        userDao.deleteOne(userId);
        return userId;
    }

}
