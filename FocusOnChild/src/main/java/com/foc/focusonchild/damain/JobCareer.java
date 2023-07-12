package com.foc.focusonchild.damain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class JobCareer {

    @Id @GeneratedValue
    @Column(name = "job_career_no")
    private int no;

    // 사용자 no 매핑하기

    // 회사명
    @NotNull
    @Column(length = 20)
    private String company_name;

    // 회사 소속 부서
    @NotNull
    @Column(length = 20)
    private String depart_name;

    // 입사일
    @NotNull
    private LocalDateTime hire_date;

    // 퇴사일
    @NotNull
    private LocalDateTime end_date;
}