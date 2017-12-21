package cn.com.controller;

import cn.com.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ControllerTwo {

    @Autowired
    private Student student;

    @RequestMapping("/test2")
    public String test1(HttpServletRequest req){

        System.err.println(student.toString());
        return "success";
    }
}
