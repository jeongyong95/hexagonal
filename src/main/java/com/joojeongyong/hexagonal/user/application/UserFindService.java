package com.joojeongyong.hexagonal.user.application;

import com.joojeongyong.hexagonal.user.application.port.out.UserRepositoryPort;
import com.joojeongyong.hexagonal.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/*
 *  비즈니스 로직이 구현되어 있는 도메인은 변경으로부터 보호받아야 한다.
 *  output port에 의존하고, input port를 구현한다.
 */

@Slf4j
@RequiredArgsConstructor
@Service
public class UserFindService {
    private final UserRepositoryPort userRepositoryPort;

    public User findUser(Long userId) {
        return userRepositoryPort.getUser(userId);
    }
}
