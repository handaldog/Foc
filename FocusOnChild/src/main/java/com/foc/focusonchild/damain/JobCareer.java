package com.foc.focusonchild.damain;


import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class JobCareer {

    @Id @GeneratedValue
    private int job_career_no;

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
