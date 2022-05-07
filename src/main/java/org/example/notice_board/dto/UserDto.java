package org.example.notice_board.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notice_board.constant.UserLevel;

import java.util.Date;

@NoArgsConstructor
@Data
public class UserDto {
    private long userId;
    private String password;
    private String nickname;
    private boolean alert;
    private int point;
    private Date since;
    private UserLevel userLevel;

    @Builder
    public UserDto(long userId, String password, String nickname, boolean alert, int point, Date since, UserLevel userLevel) {
        this.userId = userId;
        this.password = password;
        this.nickname = nickname;
        this.alert = alert;
        this.point = point;
        this.since = since;
        this.userLevel = userLevel;
    }
}
