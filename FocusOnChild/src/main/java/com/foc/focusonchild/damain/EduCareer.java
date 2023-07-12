package com.foc.focusonchild.damain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class EduCareer {

    @Id @GeneratedValue
    @Column(name = "edu_career_no")
    private int no;

    // 사용자 no 매핑하기

    // 대학교(원)
    @NotNull
    @Column(length = 20)
    private String university_name;

    // 전공명
    @NotNull
    @Column(length = 20)
    private String major_name;

    // 학위 종류
    @NotNull
    @Column(length = 10)
    private String degree;

}
