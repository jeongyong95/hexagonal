package com.joojeongyong.hexagonal.user.application.port.in;

import com.joojeongyong.hexagonal.user.application.UserFindService;
import com.joojeongyong.hexagonal.user.application.port.in.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/*
 *  input port는 애플리케이션을 호출하는 어댑터와 도메인 간 interface이다.
 *  input port는 애플리케이션을 호출하는 외부 어댑터로부터 도메인을 보호한다.
 *  input port는 외부 어댑터에게 호출되고, 도메인을 호출한다.
 */

@Slf4j
@RequiredArgsConstructor
@Component
public class UserInfoUseCasePort {
    private final UserFindService userFindService;

    public UserDto getUser(Long userId) {
        return UserDto.from(userFindService.findUser(userId));
    }
}
