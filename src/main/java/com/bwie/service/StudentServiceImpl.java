package com.bwie.service;

import com.bwie.bean.Classes;
import com.bwie.bean.Student;
import com.bwie.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/26.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student login(Student student) {
        return studentMapper.login(student);
    }

    @Override
    public List<Classes> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public List<Classes> queryAll() {
        return studentMapper.queryAll();
    }

    @Override
    public void delete(Student student) {
        studentMapper.delete(student);
    }

    @Override
    public Student selectbyid(Student student) {
        return studentMapper.selectbyid(student);
    }

    @Override
    public void update(Student student) {
        studentMapper.update(student);
    }

    @Override
    public Student userExist(Student student) {
        return studentMapper.userExist(student);
    }
}
