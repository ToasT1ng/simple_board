package org.example.notice_board.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class BoardVO {
    private String title;
    private String description;
    private boolean deleted;

    @Builder
    public BoardVO(int id, String title, String description, boolean deleted) {
        this.title = title;
        this.description = description;
        this.deleted = deleted;
    }
}
