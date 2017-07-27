package com.bwie.mapper;

import com.bwie.bean.Classes;
import com.bwie.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Mapper
@Component
public interface StudentMapper {
    //登录
    @Select("select sname,spassword from student where sname=#{sname} and spassword =#{spassword}")
    public Student login(Student student);

    //注册前查询所有班级、
    @Select("select * from classes")
    public List<Classes> selectAll();

    //注册
    @Insert("insert into student (sname,sage,sex,spassword,cid) values (#{sname},#{sage},#{sex},#{spassword},#{cid})")
    public void insert(Student student);

    //查询所有学生信息
    @Select("select s.*,c.cname from student as s,classes as c where c.id=s.cid")
    public List<Classes> queryAll();

    //根据id 删除学生
    @Delete("delete from student where sid =#{sid}")
    public void delete(Student student);

    //查询单条学生信息
    @Select("select * from student where sid=#{sid}")
    public Student selectbyid(Student student);


    //修改学生信息
    @Update("update student set sname=#{sname},sage=#{sage},sex=#{sex},spassword=#{spassword},cid=#{cid} where sid=#{sid}")
    public void update(Student student);

    //判断学生姓名是否存在
    @Select("select sname from student where sname =#{sname}")
    public Student userExist(Student student);


}
