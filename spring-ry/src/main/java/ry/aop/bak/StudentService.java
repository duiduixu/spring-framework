package ry.aop.bak.service;

import org.springframework.stereotype.Component;
import ry.aop.bak.Student;

/**
 * @author: ry
 * @date: 2024/2/20
 */
@Component
public class StudentService {
    public void update(Student student) {
        System.out.println("更新学生信息");
        System.out.println(student);
    }

    public void save(Student student) {
        System.out.println("保存学生信息");
        System.out.println(student);
    }

    public void delete(Student student) {
        System.out.println("删除学生信息");
        System.out.println(student);
    }

    public void find(Student student) {
        System.out.println("查询学生信息find");
        System.out.println(student);
    }

    public void findByName(Student student) {
        System.out.println("查询学生信息findByName");
        System.out.println(student);
    }

    public void findByNameAndAge(Student student) {
        System.out.println("查询学生信息findByNameAndAge");
        System.out.println(student);
    }
}
