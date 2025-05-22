package org.koreait.file.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {

    @GetMapping("/upload")
    public String upload(){

        return  "file/upload";
    }

//    @PostMapping("/upload")
//    public void uploadPs(@RequestPart("attach")MultipartFile file){
//        File uplaodFile = new File("C:/uploads/" + file.getOriginalFilename());
//        try{
//            file.transferTo(uplaodFile);
//        }catch (IOException e){}
//    }

    @ResponseBody
    @PostMapping("/upload")
    public void uploadPs2(@RequestPart("attach")MultipartFile[] files){
        for(MultipartFile file : files){
            File uplaodFile = new File("C:/uploads/" + file.getOriginalFilename());
            try{
                file.transferTo(uplaodFile);
            }catch (IOException e){}
        }
    }
}
