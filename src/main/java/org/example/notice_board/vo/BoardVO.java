package org.example.notice_board.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notice_board.constant.NoticeLevel;
import org.example.notice_board.dto.BoardDto;

import java.util.Date;

@NoArgsConstructor
@Data
public class BoardVO {
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
    public BoardVO(int boardNumber, String title, String content, long categoryId, int hits, long userId, int likes, Date updateDate, boolean deleted, NoticeLevel noticeLevel) {
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

    public BoardDto toDto() {
        return BoardDto.builder()
                .boardNumber(boardNumber)
                .title(title)
                .content(content)
                .categoryId(categoryId)
                .hits(hits)
                .userId(userId)
                .likes(likes)
                .updateDate(updateDate)
                .deleted(deleted)
                .noticeLevel(noticeLevel)
                .build();
    }

    public BoardDto toDto(long boardId) {
        BoardDto boardDto = toDto();
        boardDto.setBoardId(boardId);
        return boardDto;
    }
}
