package com.joojeongyong.hexagonal.user.adapter.persistence;

import com.joojeongyong.hexagonal.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *  persistence 어댑터는 output port의 구현체이다.
 *  persistence 어댑터와 도메인은 output port로 인해서 의존관계가 역전되었다. (Dependency Inversion)
 */

public interface UserRepository extends JpaRepository<User, Long> {
}
