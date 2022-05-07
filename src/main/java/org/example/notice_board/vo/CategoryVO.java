package org.example.notice_board.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notice_board.constant.UserLevel;
import org.example.notice_board.dto.CategoryDto;

@NoArgsConstructor
@Data
public class CategoryVO {
    private int parentId;
    private int orderNumber;
    private String categoryName;
    private String description;
    private UserLevel categoryUserLevel;

    @Builder
    public CategoryVO(int parentId, int orderNumber, String categoryName, String description, UserLevel categoryUserLevel) {
        this.parentId = parentId;
        this.orderNumber = orderNumber;
        this.categoryName = categoryName;
        this.description = description;
        this.categoryUserLevel = categoryUserLevel;
    }

    public CategoryDto toDto() {
        return CategoryDto.builder()
                .parentId(parentId)
                .orderNumber(orderNumber)
                .categoryName(categoryName)
                .description(description)
                .categoryUserLevel(categoryUserLevel)
                .build();
    }

    public CategoryDto toDto(long categoryId) {
        CategoryDto categoryDto = toDto();
        categoryDto.setCategoryId(categoryId);
        return categoryDto;
    }
}
