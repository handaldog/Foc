package com.foc.focusonchild.damain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data

public class User {

    // user_no, PK값
    @Id @GeneratedValue
    @Column(name = "user_no")
    private int no;

    // user id
    @NotNull
    @Column(length = 20, name = "user_id")
    private String id;

    //user name
    @NotNull
    @Column(length = 20, name = "user_name")
    private String name;

    // user email
    @NotNull
    @Column(length = 50, name = "user_email")
    private String email;

    // user password
    @NotNull
    @Column(length = 20, name = "user_password")
    private String password;

    // user tel
    @NotNull
    @Column(length = 20, name = "user_tel")
    private String tel;

    // user info
    @NotNull
    @Column(length = 30, name = "user_info")
    private String info;

    // user date (가입 시간)
    @NotNull
    @Column(name = "user_join_time")
    private LocalDateTime joindatetime;

    // user img (유저 프로필 사진)
    @Column(length = 1000, name = "profile_img")
    private String img;

}
