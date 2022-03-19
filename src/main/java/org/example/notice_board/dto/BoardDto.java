package org.example.notice_board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BoardDto {
    private int id;
    private String title;
    private String description;
    private boolean deleted;

    @Builder
    public BoardDto(int id, String title, String description, boolean deleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deleted = deleted;
    }
}
