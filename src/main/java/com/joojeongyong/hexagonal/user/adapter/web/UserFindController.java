package com.joojeongyong.hexagonal.user.adapter.web;

import com.joojeongyong.hexagonal.user.application.port.in.UserInfoUseCasePort;
import com.joojeongyong.hexagonal.user.application.port.in.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *  web 어댑터는 input port를 호출한다.
 *  web 어댑터와 도메인은 의존성이 없다.
 */

@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = {"/api/users"})
@RestController
public class UserFindController {
    private final UserInfoUseCasePort userInfoUseCasePort;

    @GetMapping(path = {"/{userId}"})
    public ResponseEntity<UserDto> getUser(@PathVariable Long userId) {
        return ResponseEntity.ok(userInfoUseCasePort.getUser(userId));
    }
}
