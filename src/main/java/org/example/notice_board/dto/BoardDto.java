package org.example.notice_board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notice_board.constant.NoticeLevel;

import java.util.Date;

@NoArgsConstructor
@Data
public class BoardDto {
    private long boardId;
    private int boardNumber;
    private String title;
    private String content;
    private long categoryId;
    private int hits;
    private long userId;
    private int likes;
    private Date updateDate;
    private boolean deleted;
    private NoticeLevel noticeLevel;

    @Builder
    public BoardDto(long boardId, int boardNumber, String title, String content, long categoryId, int hits, long userId, int likes, Date updateDate, boolean deleted, NoticeLevel noticeLevel) {
        this.boardId = boardId;
        this.boardNumber = boardNumber;
        this.title = title;
        this.content = content;
        this.categoryId = categoryId;
        this.hits = hits;
        this.userId = userId;
        this.likes = likes;
        this.updateDate = updateDate;
        this.deleted = deleted;
        this.noticeLevel = noticeLevel;
    }

}
