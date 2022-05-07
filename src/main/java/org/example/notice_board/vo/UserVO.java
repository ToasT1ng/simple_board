package org.example.notice_board.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.notice_board.constant.UserLevel;
import org.example.notice_board.dto.UserDto;

import java.util.Date;

@NoArgsConstructor
@Data
public class UserVO {
    private String password;
    private String nickname;
    private boolean alert;
    private int point;
    private Date since;
    private UserLevel userLevel;

    @Builder
    public UserVO(String password, String nickname, boolean alert, int point, Date since, UserLevel userLevel) {
        this.password = password;
        this.nickname = nickname;
        this.alert = alert;
        this.point = point;
        this.since = since;
        this.userLevel = userLevel;
    }

    public UserDto toDto() {
        return UserDto.builder()
                .password(password)
                .nickname(nickname)
                .alert(alert)
                .point(point)
                .since(since)
                .userLevel(userLevel)
                .build();
    }

    public UserDto toDto(long userId) {
        UserDto userDto = toDto();
        userDto.setUserId(userId);
        return userDto;
    }
}
