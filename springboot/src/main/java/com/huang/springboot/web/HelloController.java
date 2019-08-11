package com.huang.springboot.web;

import com.huang.springboot.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping("")
    public String hell(){
        return "/menu";
    }



    @RequestMapping("hello")
    @ResponseBody
    public Result hello() throws Exception {
//        if(true){
//            throw new Exception("some exception");
//        }
//        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return new Result(true,"success",DateFormat.getDateTimeInstance().format(new Date()));
    }

}