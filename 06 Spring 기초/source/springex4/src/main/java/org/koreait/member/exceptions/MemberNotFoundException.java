package org.koreait.member.exceptions;

import org.koreait.global.excaptions.NotFoundException;

public class MemberNotFoundException extends NotFoundException {
    public MemberNotFoundException(){
        super("회원을 찾을 수 없습니다.");
    }
}
