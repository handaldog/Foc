package com.foc.focusonchild.damain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class User {

    // user_no, PK값
    @Id @GeneratedValue
    private int user_no;

    // user id
    @NotNull
    @Column(length = 20)
    private String user_id;

    //user name
    @NotNull
    @Column(length = 20)
    private String user_name;

    // user email
    @NotNull
    @Column(length = 50)
    private String user_email;

    // user password
    @NotNull
    @Column(length = 20)
    private String user_password;

    // user tel
    @NotNull
    @Column(length = 20)
    private String user_tel;

    // user info
    @NotNull
    @Column(length = 30)
    private String user_info;

    // user date (가입 시간)
    @NotNull
    private LocalDateTime user_join_time;

    // user img (유저 프로필 사진)
    @Column(length = 1000)
    private String profile_img;

}
