package org.example.notice_board.dao;

import java.util.List;

public interface CommonDao<DTO> {
    long insertOne(DTO vo);
    List<DTO> selectAll();
    DTO selectOne(long id);
    void updateOne(DTO vo);
    void deleteOne(long id);
}
