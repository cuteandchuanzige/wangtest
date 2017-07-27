package com.bwie.controller;

import com.bwie.bean.Classes;
import com.bwie.bean.Student;
import com.bwie.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("index")
    public String index(HttpSession session, Classes classes) {
        List<Classes> c = studentService.selectAll();
        session.setAttribute("c", c);
        return "index";

    }

    //登录
    @RequestMapping("login")
    public String login(Student student) {
        Student s = studentService.login(student);
        if (s == null) {
            return "index";
        }
        return "forward:select";
    }

    //查询所有学生信息
    @RequestMapping("select")
    public String queryAll(Student student, Model model) {
        List<Classes> list = studentService.queryAll();
        model.addAttribute("list", list);
        return "select";
    }

    //注册
    @RequestMapping("insert")
    public String insert(Student student) {
        studentService.insert(student);
        return "index";
    }

    //删除
    @RequestMapping("delete")
    public String delete(Student student) {
        studentService.delete(student);
        return "forward:select";
    }


    //修改
    @RequestMapping("update")
    public String update(Student student) {
        studentService.update(student);
        return "forward:select";
    }

    //查询单条学生信息
    @RequestMapping("selectbyid")
    public String selectbyid(Student student, Model model) {
        Student s = studentService.selectbyid(student);
        model.addAttribute("s", s);
        return "update";
    }

    //判断用户名是否存在
    @RequestMapping("userExist")
    public void userExist(Student student, HttpServletResponse httpServletResponse)
            throws Exception {
        System.out.println(student.getSname());
        Student s = studentService.userExist(student);
        if (s != null) {
            httpServletResponse.getWriter().write("1");
        } else {
            httpServletResponse.getWriter().write("2");

        }
    }
}