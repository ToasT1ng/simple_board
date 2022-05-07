package org.example.notice_board.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.notice_board.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CommonDao<CategoryDto> {
    @Autowired
    private SqlSession sqlSession;

    private static final String namespace = "org.example.notice_board.CategoryMapper";

    @Override
    public long insertOne(CategoryDto vo) {
        return sqlSession.insert(namespace + ".insertCategoryOne", vo);
    }

    @Override
    public List<CategoryDto> selectAll() {
        return sqlSession.selectList(namespace + ".selectCategories");
    }

    @Override
    public CategoryDto selectOne(long categoryId) {
        return sqlSession.selectOne(namespace + ".selectCategory", categoryId);
    }

    @Override
    public void updateOne(CategoryDto vo) {
        sqlSession.update(namespace + ".updateCategoryOne", vo);
    }

    @Override
    public void deleteOne(long categoryId) {
        sqlSession.update(namespace + ".deleteCategoryOne", categoryId);
    }
}
