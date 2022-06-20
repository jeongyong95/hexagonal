package com.joojeongyong.hexagonal.user.application.port.out;

import com.joojeongyong.hexagonal.user.adapter.persistence.UserRepository;
import com.joojeongyong.hexagonal.user.domain.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
/*
 *  output port는 애플리케이션이 호출하는 외부 어댑터와 도메인 간 interface이다.
 *  output port는 애플리케이션에 의해 호출되는 외부 어댑터와 도메인 간 의존성을 역전시킨다.
 *  도메인은 output port를 호출하고, 외부 어댑터의 변경사항으로부터 보호받는다.
 */

@Slf4j
@RequiredArgsConstructor
@Repository
public class UserRepositoryPort {
    private final UserRepository userRepository;

    public User getUser(Long userId) {
        return userRepository.findById(userId).orElseThrow();
    }
}
