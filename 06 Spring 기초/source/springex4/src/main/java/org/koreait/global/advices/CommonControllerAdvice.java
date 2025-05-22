package org.koreait.global.advices;

import org.koreait.global.excaptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice("org.koreait")
public class CommonControllerAdvice {

    @ModelAttribute("commonValue")
    public String commonValue(){
        return "commonValue";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, Model model) {

        model.addAttribute("message", e.getMessage());

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        if(e instanceof CommonException commonException){
            status = commonException.getStatus();
        }

        e.printStackTrace();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error/error");
        modelAndView.setStatus(status);

        return modelAndView;
    }
}
