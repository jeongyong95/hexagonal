package com.joojeongyong.hexagonal.user.application.port.in.dto;

import com.joojeongyong.hexagonal.user.domain.User;
import lombok.*;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class UserDto {

    private Long userId;
    private String userName;

    public static UserDto from(User user) {
        return UserDto.builder()
            .userId(user.getUserId())
            .userName(user.getUserName())
            .build();
    }
}
