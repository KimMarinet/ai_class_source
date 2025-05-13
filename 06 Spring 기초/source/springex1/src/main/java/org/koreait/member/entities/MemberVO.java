package org.koreait.member.entities;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MemberVO {
    private long seq;
    private String email;
    private String password;
    private String name;
    private LocalDateTime RegDt;
    private String regDtStr;
}
