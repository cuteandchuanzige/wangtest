package com.bwie.service;

import com.bwie.bean.Classes;
import com.bwie.bean.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
public interface StudentService {
    //登录
    public Student login(Student student);

    //注册前查询所有班级、
    public List<Classes> selectAll();

    //注册
    public void insert(Student student);

    //查询所有学生信息
    public List<Classes> queryAll();

    //根据id 删除学生
    public void delete(Student student);

    //查询单条学生信息
    public Student selectbyid(Student student);


    //修改学生信息
    public void update(Student student);
    //判断学生姓名是否存在
    public Student userExist(Student student);
}
