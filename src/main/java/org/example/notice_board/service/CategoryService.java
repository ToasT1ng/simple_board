package org.example.notice_board.service;

import lombok.RequiredArgsConstructor;
import org.example.notice_board.dao.CommonDao;
import org.example.notice_board.dto.CategoryDto;
import org.example.notice_board.util.DBIdGenerator;
import org.example.notice_board.vo.CategoryVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CommonDao<CategoryDto> categoryDao;

    public List<CategoryDto> getCategories() {
        return categoryDao.selectAll();
    }

    public CategoryDto getCategory(long categoryId) {
        return categoryDao.selectOne(categoryId);
    }

    public long setCategory(CategoryVO vo) {
        CategoryDto categoryDto = vo.toDto(DBIdGenerator.makeId());
        return categoryDao.insertOne(categoryDto);
    }

    public long updateCategory(long categoryId, CategoryVO vo) {
        CategoryDto categoryDto = vo.toDto(categoryId);
        categoryDao.updateOne(categoryDto);
        return categoryId;
    }

    public long deleteCategory(long categoryId) {
        categoryDao.deleteOne(categoryId);
        return categoryId;
    }
}
