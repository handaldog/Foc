package com.foc.focusonchild.damain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
public class User {

    // user_no, PK값
    @Id @GeneratedValue
    @Column(name = "user_no")
    private int no;

    // user id
    private String id;

    //user name
    private String name;

    // user email
    private String email;

    // user password
    private String password;

    // user tel
    private String tel;

    // user info
    private String info;

    // user date (가입 시간)
    private LocalDateTime joindatetime;

    // user img (유저 프로필 사진)
    private String img;

}
