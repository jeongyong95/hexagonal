package com.joojeongyong.hexagonal.user.domain;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Table(name = "shop_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false, updatable = false)
    private Long userId;

    @Column(name = "user_name", length = 64, nullable = false)
    private String userName;

    @Column(name = "user_email", nullable = false, updatable = false)
    private String userEmail;

    @Column(name = "user_login_id", length = 100, nullable = false, updatable = false)
    private String userLoginId;

    @Column(name = "user_password", nullable = false)
    private String userPassword;
}
