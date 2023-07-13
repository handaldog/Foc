package com.foc.focusonchild.damain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data

public class EduCareer {

    @Id @GeneratedValue

    private int edu_career_no;

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
