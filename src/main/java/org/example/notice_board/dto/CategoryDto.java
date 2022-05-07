package org.example.notice_board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notice_board.constant.UserLevel;

@NoArgsConstructor
@Data
public class CategoryDto {
    private long categoryId;
    private long parentId;
    private int orderNumber;
    private String categoryName;
    private String description;
    private UserLevel categoryUserLevel;

    @Builder
    public CategoryDto(long categoryId, long parentId, int orderNumber, String categoryName, String description, UserLevel categoryUserLevel) {
        this.categoryId = categoryId;
        this.parentId = parentId;
        this.orderNumber = orderNumber;
        this.categoryName = categoryName;
        this.description = description;
        this.categoryUserLevel = categoryUserLevel;
    }
}
