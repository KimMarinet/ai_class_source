package org.koreait.member.validators;

import org.koreait.member.controllers.RequestJoin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class JoinValidator2 implements Validator {

    //검증하는 커맨드 객체 한정
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        /**
         * 1. 필수 항목 검증(이메일 ...)
         * 2. 비밀번호 자리수 검증
         * 3. 중복 가입 여부
         * 4. 비밀번호 확인
         */
        RequestJoin form = (RequestJoin)target;
//        String email = form.getEmail();
//        String password = form.getPassword();
//        String confirmPassword = form.getConfirmPassword();
//        String name = form.getName();
        boolean agree = form.isAgree();

        // 1번 S

//        if(email == null || email.isBlank()){
//            errors.rejectValue("email", "Required","이메일을 입력하세요.");
//        }
//
//        if(password == null || email.isBlank()){
//            errors.rejectValue("password", "Required","비밀번호를 입력하세요.");
//        }
//
//        if(confirmPassword == null || email.isBlank()){
//            errors.rejectValue("confirmPassword", "Required","비밀 번호를 확인하세요.");
//        }
//
//        if(name == null || email.isBlank()){
//            errors.rejectValue("name", "Required","이름을 입력하세요.");
//        }

        // 1번 E

        // 필수 항목 검증 S

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword","Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required");

        if(!form.isAgree()){
            errors.rejectValue("agree","Required");
        }
        // 필수 항목 검증 E
    }
}
